import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DoDungHocTap extends SanPham {
    protected String xuatXu, thuongHieu, nhaCungCap, huongDanSuDung, mauSac, chatLieu;
    protected float kichThuoc;

    public DoDungHocTap() {
    }

    public DoDungHocTap(String maSp, String tenSP, String thuocDanhMuc, int soLuong, float donGia, String xuatXu, String thuongHieu, String nhaCungCap, String huongDanSuDung, String mauSac, String chatLieu, float kichThuoc) {
        super(maSp, tenSP, thuocDanhMuc, soLuong, donGia);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
        this.mauSac = mauSac;
        this.chatLieu = chatLieu;
        this.kichThuoc = kichThuoc;
    }

    public String getXuatXu() {
        return xuatXu;
    }

    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    public String getThuongHieu() {
        return thuongHieu;
    }

    public void setThuongHieu(String thuongHieu) {
        this.thuongHieu = thuongHieu;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public String getHuongDanSuDung() {
        return huongDanSuDung;
    }

    public void setHuongDanSuDung(String huongDanSuDung) {
        this.huongDanSuDung = huongDanSuDung;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(String chatLieu) {
        this.chatLieu = chatLieu;
    }

    public float getKichThuoc() {
        return kichThuoc;
    }

    public void setKichThuoc(float kichThuoc) {
        this.kichThuoc = kichThuoc;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("========Do Dung hoc tap========");
        System.out.println("Ma san pham: " + getMaSp());
        System.out.println("Tên Sản phẩm: " + getTenSP());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Thuộc danh mục: " + getThuocDanhMuc());

        System.out.println("Xuất xứ: " + getXuatXu());
        System.out.println("Thương hiệu: " + getThuongHieu());
        System.out.println("Nhà cung cấp: " + getNhaCungCap());
        System.out.println("Hướng dẩn sử dụng: " + getHuongDanSuDung());
        System.out.println("Màu sắc: " + getMauSac());
        System.out.println("Chất liệu: " + getChatLieu());
        System.out.println("Kích thước: " + getKichThuoc());
    }

    public DoDungHocTap themDoDungHocTap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Them Do dung hoc tap=======");
        System.out.println("Ma san pham: ");
        String maSP = scanner.nextLine();
        System.out.println("Tên Sản phẩm: " );
        String tenSP = scanner.nextLine();
        System.out.println("Số lượng: " );
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("Đơn giá: ");
        float donGia = Float.parseFloat(scanner.nextLine());
        System.out.println("Thuộc danh mục: ");
        String thuocDanhMuc = scanner.nextLine();

        System.out.println("Xuất xú: ");
        String xuatXu = scanner.nextLine();
        System.out.println("Thương hiệu: ");
        String thuongHieu = scanner.nextLine();
        System.out.println("Nhà cung cấp: ");
        String nhaCungCap = scanner.nextLine();
        System.out.println("Hướng dẩn sử dụng: " );
        String huongDanSuDung = scanner.nextLine();
        System.out.println("Màu sắc: " );
        String mauSac = scanner.nextLine();
        System.out.println("Chất liệu: ");
        String chatLieu = scanner.nextLine();
        System.out.println("Kích thước: ");
        float kichThuoc = Float.parseFloat(scanner.nextLine());
        DoDungHocTap doDungHocTap = new DoDungHocTap(maSP,tenSP,thuocDanhMuc,soLuong,donGia,xuatXu,thuongHieu,nhaCungCap,huongDanSuDung,mauSac,chatLieu,kichThuoc);
        return  doDungHocTap;
    }

    @Override
    public String toString() {
        return "DoDungHocTap{" +
                "xuatXu='" + xuatXu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", huongDanSuDung='" + huongDanSuDung + '\'' +
                ", mauSac='" + mauSac + '\'' +
                ", chatLieu='" + chatLieu + '\'' +
                ", kichThuoc=" + kichThuoc +
                ", maSp='" + maSp + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", thuocDanhMuc='" + thuocDanhMuc + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    @Override
    public void phanTramGiamGia(String loaiKhachHang) {
        System.out.println(loaiKhachHang == "Thuong" ? 0.01 : loaiKhachHang == "Vip1" ? 0.03 : loaiKhachHang == "Vip2" ? 0.07 : 0);
    }

    public void luuVaoFile(){
        String tenFile = "src\\file\\Dodunghoctap.svc";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file Dodunghoctap.csv------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file DoDungHocTap.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
}
