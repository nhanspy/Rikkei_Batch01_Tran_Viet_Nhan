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
        System.out.println("T??n S???n ph???m: " + getTenSP());
        System.out.println("S??? l?????ng: " + getSoLuong());
        System.out.println("????n gi??: " + getDonGia());
        System.out.println("Thu???c danh m???c: " + getThuocDanhMuc());

        System.out.println("Xu???t x???: " + getXuatXu());
        System.out.println("Th????ng hi???u: " + getThuongHieu());
        System.out.println("Nh?? cung c???p: " + getNhaCungCap());
        System.out.println("H?????ng d???n s??? d???ng: " + getHuongDanSuDung());
        System.out.println("M??u s???c: " + getMauSac());
        System.out.println("Ch???t li???u: " + getChatLieu());
        System.out.println("K??ch th?????c: " + getKichThuoc());
    }

    public DoDungHocTap themDoDungHocTap(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Them Do dung hoc tap=======");
        System.out.println("Ma san pham: ");
        String maSP = scanner.nextLine();
        System.out.println("T??n S???n ph???m: " );
        String tenSP = scanner.nextLine();
        System.out.println("S??? l?????ng: " );
        int soLuong = Integer.parseInt(scanner.nextLine());
        System.out.println("????n gi??: ");
        float donGia = Float.parseFloat(scanner.nextLine());
        System.out.println("Thu???c danh m???c: ");
        String thuocDanhMuc = scanner.nextLine();

        System.out.println("Xu???t x??: ");
        String xuatXu = scanner.nextLine();
        System.out.println("Th????ng hi???u: ");
        String thuongHieu = scanner.nextLine();
        System.out.println("Nh?? cung c???p: ");
        String nhaCungCap = scanner.nextLine();
        System.out.println("H?????ng d???n s??? d???ng: " );
        String huongDanSuDung = scanner.nextLine();
        System.out.println("M??u s???c: " );
        String mauSac = scanner.nextLine();
        System.out.println("Ch???t li???u: ");
        String chatLieu = scanner.nextLine();
        System.out.println("K??ch th?????c: ");
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
            System.out.println("--------???? ghi Sach v??o file DoDungHocTap.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
}
