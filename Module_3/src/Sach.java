import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Sach extends SanPham {


    protected String nhaXuatBan, namSX, tacGia;
    protected Date ngaySanXuat;
    protected int lanTaiBan;

    public Sach(){

    }
    @Override
    public String toString() {
        return "Sach{" +
                "nhaXuatBan='" + nhaXuatBan + '\'' +
                ", namSX='" + namSX + '\'' +
                ", tacGia='" + tacGia + '\'' +
                ", ngaySanXuat=" + ngaySanXuat +
                ", lanTaiBan=" + lanTaiBan +
                ", maSp='" + maSp + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", thuocDanhMuc='" + thuocDanhMuc + '\'' +
                ", soLuong=" + soLuong +
                ", donGia=" + donGia +
                '}';
    }

    public Sach(String maSp, String tenSP, String thuocDanhMuc, int soLuong, float donGia, String nhaXuatBan, String namSX, String tacGia, Date ngaySanXuat, int lanTaiBan) {
        super(maSp, tenSP, thuocDanhMuc, soLuong, donGia);
        this.nhaXuatBan = nhaXuatBan;
        this.namSX = namSX;
        this.tacGia = tacGia;
        this.ngaySanXuat = ngaySanXuat;
        this.lanTaiBan = lanTaiBan;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public String getNamSX() {
        return namSX;
    }

    public void setNamSX(String namSX) {
        this.namSX = namSX;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getLanTaiBan() {
        return lanTaiBan;
    }

    public void setLanTaiBan(int lanTaiBan) {
        this.lanTaiBan = lanTaiBan;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    @Override
    public void hienThiThongTin() {
        System.out.println("======Sach=======");
        System.out.println("Ma san pham: " + getMaSp());
        System.out.println("T??n S???n ph???m: " + getTenSP());
        System.out.println("S??? l?????ng: " + getSoLuong());
        System.out.println("????n gi??: " + getDonGia());
        System.out.println("Thu???c danh m???c: " + getThuocDanhMuc());

        System.out.println("Nh?? xu???t b???n: " + getNhaXuatBan());
        System.out.println("N??m xu???t b???n: " + getNamSX());
        System.out.println("T??c gi???: " + getTacGia());
        System.out.println("Ng??y xu???t b???n: " + getNgaySanXuat());
        System.out.println("L???n t??i b???n: " + getLanTaiBan());
    }

    @Override
    public void phanTramGiamGia(String loaiKhachHang) {
        System.out.println(loaiKhachHang == "Thuong" ? 0.02 : loaiKhachHang == "Vip1" ? 0.05 : loaiKhachHang == "Vip2" ? 0.1 : 0);
    }

    public Sach themSach(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======Them sach=======");
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

        System.out.println("Nh?? xu???t b???n: " );
        String nhaXuatBan = scanner.nextLine();
        System.out.println("N??m xu???t b???n: ");
        String namXuatBan = "0";
        while (true) {
            namXuatBan = scanner.nextLine();
            if (Integer.parseInt(namXuatBan) <= 2021 && Integer.parseInt(namXuatBan) >= 1000)
                break;
            System.out.println("(Error) Nhap lai Nam xuat ban: ");
        }
        System.out.println("T??c gi???: ");
        String tacGia = scanner.nextLine();
        System.out.println("Ng??y xu???t b???n: ");
        String ngayXuatBan = scanner.nextLine();
        Date ngayXuatBanDate = new Date();
        while (true) {
            try {
                ngayXuatBanDate = new SimpleDateFormat("dd/MM/yyyy").parse(ngayXuatBan);
                break;
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("(Error) Nhap lai ngay xuat ban: ");
                ngayXuatBan = scanner.nextLine();
            }
        }
        System.out.println("L???n t??i b???n: ");
        int lanTaibanInp = 0;
        while (true) {
            lanTaibanInp = Integer.parseInt(scanner.nextLine());
            if (lanTaibanInp >= 0)
                break;
            System.out.println("(Error) Nhap lai lan tai ban: ");
        }

        Sach sach = new Sach(maSP, tenSP, thuocDanhMuc,soLuong, donGia,nhaXuatBan, namXuatBan, tacGia, ngayXuatBanDate, lanTaiBan);
        return sach;
    }

    public void luuVaoFile(){
        String tenFile = "src\\file\\Sach.svc";
        try {
            File file = new File(tenFile);
            if (!file.exists())
                if (file.createNewFile()){
                    System.out.println("--------Create new file Sach.csv------");
                }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------???? ghi Sach v??o file Sach.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
}
