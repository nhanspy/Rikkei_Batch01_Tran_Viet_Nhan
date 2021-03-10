import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Date;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class HoaDon {
    protected String maHoaDon, maKhachHang, maSanPham;
    protected int soLuong;
    protected Date ngayMua;
    protected float donGia, tongTien = 0;
    Scanner scanner;

    public HoaDon() {
        scanner = new Scanner(System.in);
    }

    public HoaDon(String maHoaDon, String maKhachHang, String maSanPham, int soLuong, Date ngayMua, float donGia) {
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.ngayMua = ngayMua;
        this.donGia = donGia;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayMua() {
        return ngayMua;
    }

    public void setNgayMua(Date ngayMua) {
        this.ngayMua = ngayMua;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public void hienThiThongTin(){
        System.out.println("---------Hien thi thong tin hoa don--------");
        System.out.println(this.toString());
    }

    public HoaDon themMoiHoaDon(){
        System.out.println("---------Them hoa don-----------");
        System.out.println("Ma hoa don: ");
        String maHoaDon = scanner.nextLine();
        System.out.println("Ma khach hang: ");
        String maKhachHang = scanner.nextLine();
        System.out.println("Ma san pham: ");
        String maSanPham = scanner.nextLine();
        System.out.println("So luong");
        int soLuong = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ngay mua: ");
        Date ngayMua = new Date();
        try {
            ngayMua = new SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
        } catch (Exception e){

        }
        System.out.println("Don gia: ");
        float donGia = scanner.nextFloat();
        HoaDon hoaDon = new HoaDon(maHoaDon,maKhachHang,maSanPham,soLuong,ngayMua,donGia);
        return hoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", soLuong='" + soLuong + '\'' +
                ", ngayMua=" + ngayMua +
                ", donGia=" + donGia +
                ", tongTien=" + tongTien +
                '}';
    }

    public void luuVaoFile(){
        String tenFile = "src\\file\\HoaDon.svc";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file HoaDon.csv------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file HoaDon.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
}
