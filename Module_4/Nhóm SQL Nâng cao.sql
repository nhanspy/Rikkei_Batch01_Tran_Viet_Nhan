#1. Tạo clustered index có tên ix_SanPhamSach trên bảng SanPhamSach.
# Giải thích lý do vì sao không tạo được.

CREATE CLUSTERED INDEX ix_SanPhamSach on SanPhamSach(MaSPSach);
#không được vì mặc định SanPhamSach(MaSPSach) là primary key cũng là CLUSTERED INDEX

#2 Tạo Non-clustered index có tên là ix_TenSp_NhaXuatBan trên hai cột TenSPSach và NhaXuatBan của bảng SanPhamSach.
CREATE UNIQUE INDEX ix_TenSp_NhaXuatBan on SanPhamSach(TenSPSach, NhaXuatBan);

#3 Tạo View có tên là V_KhachHang trên bảng Khách hàng bao gồm các thông tin
# MaKhachHang, TenKhachHang, NgaySinh, SoDienThoai.

CREATE VIEW V_KhachHang AS
    SELECT MaKhachHang, TenKhachHang, NgaySinh, SoDienThoai
    FROM khachhang;

#4 Cập nhật view V_KhachHang của những Khách hàng có
# Ngày Sinh nhỏ hơn 18 tuổi thì cập nhật loại khách hàng thành VIP 1.

CREATE OR REPLACE VIEW V_KhachHang AS
    SELECT MaKhachHang, TenKhachHang, NgaySinh, SoDienThoai
    FROM khachhang
    WHERE DATEDIFF(NOW(), NgaySinh) < 18;

SELECT * FROM V_KhachHang;

#5 Tạo Stored procedure theo yêu cầu sau
#Tạo Sp_1: Thực hiện thêm mới một đơn hàng vào bảng DonHang.
# Yêu cầu dữ liệu thêm mới phải thõa mãn ràng buộc toàn vẹn dữ liệu từ các bảng liên quan

DELIMITER $$
CREATE PROCEDURE Sp_1(IN MaDonHang NVARCHAR(45), IN MaKhachHang NVARCHAR(45), IN MaNhanVien NVARCHAR(45), IN NgayMuaHang DATE, IN TongTien FLOAT)
BEGIN
   INSERT INTO donhang(MaDonHang, MaKhachHang, MaNhanVien, NgayMuaHang, TongTien)
   VALUES (MaDonHang, MaKhachHang, MaNhanVien, NgayMuaHang, TongTien);
END; $$

Call Sp_1("donhang010", "khachhang1", "nhanvien1", "2021-9-3", 10021);

#Tạo Sp_2: Thực hiện cập nhật Chi tiết Dơn hàng với Số lượng tăng lên gấp đôi,
# với mã Đơn hàng được truyền vào như là 1 tham số.

DELIMITER $$
CREATE PROCEDURE Sp_2 (IN MaDonHang VARCHAR(45))
BEGIN
    UPDATE chitietdonhang SET SoLuong = SoLuong*2 WHERE MaDonHang = MaDonHang;
END; $$

CAlL Sp_2 ("donhang1");

#6. Tạo User function theo yêu cầu sau:
#Tạo func_1: Thực hiện thống kê tương ứng mỗi Sản phẩm đã mua hết bao nhiêu tiền.
# Với mã Khách hàng được tuyền vào như là 1 tham số của user function

#Chưa hiểu đề với lại mỗi sản phẩm phải chia ra làm 3 table nên chưa biết cách xử lý

#Tạo func_1: Tính tổng tiền lớn nhất mà khách hàng đã mua cho một sản phẩm
# ( lưu ý chỉ xét trên từng sản phẩm không xét trên các đơn hàng).
# Mã khách hàng được truyền vào như là 1 tham số của user function

#Tương tự

#7 Tạo Trigger theo yêu cầu sau:
#Trigger_1: Khi thực hiện xóa đơn hàng thì hiển thị số lượng bản ghi còn lại
# trong bảng đơn hàng sau khi xóa và số lượng bản ghi đã được xóa.

#Mà trigger thì sao mà hiển thị được ??
CREATE TRIGGER Trigger_1 AFTER DELETE
    ON donhang
    FOR EACH ROW
    BEGIN
        SELECT COUNT(*) FROM NEW;
    end; $$

#Trigger_2: Khi thực hiện cập nhật Ngày Mua hàng trên bảng
# Đơn hàng cần thực hiện kiểm tra xem ngày mua hàng phải <= ngày hiện tại.
# Nếu dữ liệu hợp lệ thì cho phép cập nhật, nếu không thì hiển thị thông báo lên console
# “Ngày mua hàng phải nhỏ hơn hoặc bằng ngày hiện tại”.

DROP TRIGGER IF EXISTS Trigger_2;
CREATE TRIGGER Trigger_2 AFTER UPDATE
    ON donhang
    FOR EACH ROW
    BEGIN
#         UPDATE donhang SET MaDonHang = NEW.MaDonHang, MaNhanVien = NEW.MaNhanVien, NgayMuaHang = NEW.NgayMuaHang, MaKhachHang = NEW.MaKhachHang
#         WHERE NEW.NgayMuaHang <= NOW();
        IF NEW.NgayMuaHang <= NOW() THEN
            UPDATE donhang SET MaNhanVien = NEW.MaNhanVien, NgayMuaHang = NEW.NgayMuaHang, MaKhachHang = NEW.MaKhachHang
            WHERE MaDonHang = OLD.MaDonHang;
        end IF;
#         ROLLBACK ;
    end;


