#2 Hiển thị thông tin của các cản phẩm có số lượng > 20 và có đơn giá < 1.000.000 VNĐ
SELECT * from sanphamdochoi a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

SELECT * from sanphamdungcu a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

SELECT * from sanphamsach a
WHERE a.SoLuong > 20 and a.DonGia < 1000000;

#3. Hiển thị thông tin của những Khách hàng có độ tuổi >16 tuổi và < 30 tuổi
# có địa chỉ ở Đà Nẵng hoặc những Khách hàng có độ tuổi > 40 tuổi và có địa chỉ ở Quảng Nam

SELECT * FROM khachhang as a
WHERE ROUND(DATEDIFF(now() , a.NgaySinh)/365) BETWEEN 16 and 30
  AND ROUND(DATEDIFF(now() , a.NgaySinh)/365) = 40;

#4 Hiển thị thông tin của Những Sản phẩm đã được Khách hàng mua trong năm 2020
SELECT * FROM sanphamsach s
WHERE s.MaSPSach in (SELECT MaSanPham FROM chitietdonhang a, donhang b where a.MaDonHang = b.MaDonHang and YEAR(b.NgayMuaHang) = 2020);
SELECT * FROM sanphamdungcu s
WHERE s.MaSPDungCu in (SELECT MaSanPham FROM chitietdonhang a, donhang b where a.MaDonHang = b.MaDonHang and YEAR(b.NgayMuaHang) = 2020);
SELECT * FROM sanphamdochoi s
WHERE s.MaSPDoChoi in (SELECT MaSanPham FROM chitietdonhang a, donhang b where a.MaDonHang = b.MaDonHang and YEAR(b.NgayMuaHang) = 2020);

#5 Hiển thị thông tin tương ứng mỗi Khách hàng đã mua bao nhiêu sản phẩm trong Quý 4 của năm 2020.
SELECT TenKhachHang, SUM(SoLuong) as SoLuong FROM donhang h,chitietdonhang c, khachhang k
WHERE h.MaDonHang = c.MaDonHang and k.MaKhachHang = h.MaKhachHang and QUARTER(h.NgayMuaHang) = 3
GROUP BY TenKhachHang;

#6 Hiển thị thông tin của những Khách hàng có tên bắt đầu là các ký tự
# ‘K’, ‘H’ hoặc ‘T’ và có độ dài tối thiểu 15 ký tự.

SELECT * FROM khachhang
WHERE (TenKhachHang LIKE "K%" or TenKhachHang LIKE "H%" or TenKhachHang LIKE "L%") and LENGTH(TenKhachHang) >= 15;

#7 Hiển thị thông tin bao gồm
# MaSanPham, TenSanPham, DonGia, DonVi, NhaXuatBan, TacGia, TheLoai, MaKhachHang, SoDienThoai, SoLuongMua, TongTien
# của những Sản phẩm sách đã từng được Khách hàng đặt mua trong năm 2020.
# Những sản phẩm nào chưa từng được Khách hàng đặt mua thì cũng hiển thị thông tin sản phẩm đó ra.



#8 Hiển thị thông tin Tên khách hàng có trong hệ thống,
# với yêu cầu Tên khách hàng không trùng nhau.

#cách 1
SELECT TenKhachHang FROM khachhang
GROUP BY TenKhachHang;

#cách 2


#9 Hiển thị thông tin bao gồm MaSanPham, TenSanPham, TenLoaiSanPham
# của tất cả các sản phẩm đã được khách hàng đặt hàng trong năm 2019
# nhưng chưa từng được khách hàng đặt hàng trong năm 2020.

SELECT MaSPDoChoi, TenSPDoChoi, Nhom FROM sanphamdochoi a, dmdochoi b, donhang c, chitietdonhang d
WHERE a.MaDMDoChoi = b.MaDMDoChoi and d.MaDonHang = c.MaDonHang and a.MaSPDoChoi = d.MaSanPham and YEAR(NgayMuaHang) = 2019 and YEAR(NgayMuaHang) != 2020;

SELECT MaSPSach, TenSPSach, TheLoai FROM sanphamsach a, blog.dmsach b, donhang c, chitietdonhang d
WHERE a.MaDMSach = b.MaDMSach and d.MaDonHang = c.MaDonHang and a.MaSPSach = d.MaSanPham and YEAR(NgayMuaHang) = 2019 and YEAR(NgayMuaHang) != 2020;

SELECT MaSPDungCu, TenSPDungCu, Khoi FROM sanphamdungcu a, dmdungcu b, donhang c, chitietdonhang d
WHERE a.MaDMDungCU = b.MaDMDungCu and d.MaDonHang = c.MaDonHang and a.MaSPDungCu = d.MaSanPham and YEAR(NgayMuaHang) = 2019 and YEAR(NgayMuaHang) != 2020;

#10 Hiển thị thông tin của những Khách hàng đã từng mua sản phẩm đồ chơi là
# “Bộ xếp hình” nhưng chưa từng mua sản phẩm đồ chơi là “Bộ chơi cát” trong những năm 2019, 2020.

SELECT * FROM khachhang
WHERE MaKhachHang in (
    SELECT MaKhachHang
    FROM donhang a, chitietdonhang b, sanphamdochoi c
    WHERE a.MaDonHang = b.MaDonHang and c.MaSPDoChoi = b.MaSanPham
      and (c.MaSPDoChoi = "Bộ xếp hình" or
           !(c.MaSPDoChoi = "Bộ chơi cát" and YEAR(NgayMuaHang) BETWEEN 2019 and 2020))
);
© 2021 GitHub, Inc.