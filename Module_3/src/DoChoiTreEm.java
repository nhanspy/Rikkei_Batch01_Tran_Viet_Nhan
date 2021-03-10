import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class DoChoiTreEm extends SanPham {
    protected String xuatXu, thuongHieu, nhaCungCap, huongDanSuDung;

    public DoChoiTreEm() {
    }

    public DoChoiTreEm(String maSp, String tenSP, String thuocDanhMuc, int soLuong, float donGia, String xuatXu, String thuongHieu, String nhaCungCap, String huongDanSuDung) {
        super(maSp, tenSP, thuocDanhMuc, soLuong, donGia);
        this.xuatXu = xuatXu;
        this.thuongHieu = thuongHieu;
        this.nhaCungCap = nhaCungCap;
        this.huongDanSuDung = huongDanSuDung;
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

    @Override
    public void hienThiThongTin() {
        System.out.println("======Do choi tre em======");
        System.out.println("Ma san pham: " + getMaSp());
        System.out.println("Tên Sản phẩm: " + getTenSP());
        System.out.println("Số lượng: " + getSoLuong());
        System.out.println("Đơn giá: " + getDonGia());
        System.out.println("Thuộc danh mục: " + getThuocDanhMuc());

        System.out.println("Xuất xú: "+getXuatXu());
        System.out.println("Thương hiệu: " + getThuongHieu());
        System.out.println("Nhà cung cấp: "+ getNhaCungCap());
        System.out.println("Hướng dẩn sử dụng: " + getHuongDanSuDung());
    }

    public DoChoiTreEm themDoChoiTreEm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Them sach=======");
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
        System.out.println("Hướng dẩn sử dụng: ");
        String huongDanSuDung = scanner.nextLine();

        DoChoiTreEm doChoiTreEm = new DoChoiTreEm(maSP, tenSP, thuocDanhMuc,soLuong, donGia, xuatXu, thuongHieu, nhaCungCap, huongDanSuDung);
        return doChoiTreEm;
    }

    @Override
    public String toString() {
        return "DoChoiTreEm{" +
                "xuatXu='" + xuatXu + '\'' +
                ", thuongHieu='" + thuongHieu + '\'' +
                ", nhaCungCap='" + nhaCungCap + '\'' +
                ", huongDanSuDung='" + huongDanSuDung + '\'' +
                ", maSp='" + maSp + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", thuocDanhMuc='" + thuocDanhMuc + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }



    @Override
    public void phanTramGiamGia(String loaiKhachHang) {
        System.out.println(loaiKhachHang == "Thuong" ? 0.02 : loaiKhachHang == "Vip1" ? 0.05 : loaiKhachHang == "Vip2" ? 0.7 : 0);
    }

    public void luuVaoFile(){
        String tenFile = "src\\file\\DoChoiTreEm.svc";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file Do Choi Tre Em.csv------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file Do Choi Tre Em.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
}
