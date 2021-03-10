import java.io.File;
import java.io.FileWriter;

public class KhachHang {
    protected String maKhachHang, hoTen, soDT, email, ngaySinh, loaiKhachHang;

    public KhachHang(String maKhachHang, String hoTen, String soDT, String email, String ngaySinh, String loaiKhachHang) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.soDT = soDT;
        this.email = email;
        this.ngaySinh = ngaySinh;
        this.loaiKhachHang = loaiKhachHang;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public void luuVaoFile(){
        String tenFile = "src\\file\\KhachHang.svc";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file KhachHang vào KhachHang.csv------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file KhachHang.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }
}
