import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class MainmenuControll {
    dsSanPham sanPhams;
    dsHoaDon hoaDons;
    Scanner scanner;
    dsKhachHang khachHangs;

    public MainmenuControll() {
        sanPhams = new dsSanPham();
        hoaDons = new dsHoaDon();
        scanner = new Scanner(System.in);
        khachHangs = new dsKhachHang();
    }

    public MainmenuControll(dsSanPham sanPhams, dsHoaDon hoaDons) {
        this.sanPhams = sanPhams;
        this.hoaDons = hoaDons;
    }

    public void menu(){

        boolean bool = true;
        while (bool){
            System.out.println("---------------------------------");
            System.out.println("---------------Menu--------------");
            System.out.println("----------------------------------");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Thêm Đơn hàng ");
            System.out.println("3. Hiển thị thông tin sản phẩm");
            System.out.println("4. Hiển thị danh sách Đơn Hàng ");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Lưu vào file");
            System.out.println("7. Thoat");
            int index;
            Scanner scanner = new Scanner(System.in);
            index = scanner.nextInt();
            switch (index){
                case 1:
                    menuThemSanPham();
                    break;
                case 2:
                    menuThemDonHang();
                    break;
                case 3:
                    menuHienThiThongTinSanPham();
                    break;
                case 4:
                    menuHienThiDanhSachDonHang();
                    break;
                case 5:
                    menuTimKiem();
                    break;
                case 6:
                    menuLuuVaoFile();
                    break;
                case 7:
                    return;
            }
        }
        
    }

    private void menuLuuVaoFile() {
        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("------------Lưu vào file--------------");
            System.out.println("--------------------------------------");
            System.out.println("1.  lưu trữ thông tin của các sản phẩm là Sách");
            System.out.println("2. lưu trữ các sản phẩm là Đồ dùng học tập");
            System.out.println("3.  lưu trữ thông tin của các sản phẩm là Đồ chơi trẻ em");
            System.out.println("4.  lưu trữ thông tin khách hàng");
            System.out.println("5. lưu trữ thông tin mua hàng cua khach hang");
            System.out.println("6. Thoat");
            int index = 0;
            index = scanner.nextInt();
            switch (index){
                case 1:
                    sanPhams.luuCacSanPhamSach();
                    break;
                case 2:
                    sanPhams.luuTatCaDoDungHocTapVaoFile();
                    break;
                case 3:
                    sanPhams.luuTatCaDoChoiTreEmVaoFile();
                    break;
                case 4:
                    khachHangs.luuTatCaKhachHangVaoFile();
                case 5:
                    hoaDons.luuTatCaVaoFile();
                case 6:
                    return;
            }
        }


    }

    private void menuTimKiem() {

        boolean bool = true;
        while (bool){
            System.out.println("-------------------------------------");
            System.out.println("-------------Tìm kiếm------------------");
            System.out.println("---------------------------------------------");
            System.out.println("1. Tìm kiếm Sản phẩm theo Mã sản phẩm");
            System.out.println("2. Tìm kiếm đơn hàng theo Mã Khách hàng");
            System.out.println("3. Thoat");
            int index = scanner.nextInt();
            switch (index) {
                case 1:
                    System.out.println("----------------------------------------");
                    System.out.println("---Tìm kiếm Sản phẩm theo Mã sản phẩm----");
                    System.out.println("----------------------------------------");
                    System.out.println("Nhap ma san pham: ");
                    String maSP = scanner.nextLine();
                    try {
                        SanPham sanPham = sanPhams.timSanPhamTheoMaSP(maSP);
                        sanPham.hienThiThongTin();
                    } catch (Exception e){
                        System.out.println(e);
                    }

                    break;
                case 2:
                    System.out.println("----------------------------------------------------");
                    System.out.println("------Tìm kiếm đơn hàng theo Mã Khách hàng---------");
                    System.out.println("--------------------------------------------------");
                    System.out.println("Nhap ma khach hang: ");
                    scanner.nextLine();
                    String maKhachHang = scanner.nextLine();
                    try {
                        HoaDon hoaDon = hoaDons.timHoaDonTheoMaKhachHang(maKhachHang);
                        hoaDon.hienThiThongTin();
                    } catch (Exception e){
                        System.out.println(e);
                    }

                    break;
                case 3:
                    return;
            }
        }
    }

    private void menuHienThiDanhSachDonHang() {
        System.out.println("----------------------------------");
        System.out.println("----Hien thi danh sach hoa don----");
        System.out.println("----------------------------------");
        hoaDons.hienThiTaCaHoaDon();
    }

    private void menuHienThiThongTinSanPham() {
        int index;
        while (true){
            System.out.println("----------------------------------------");
            System.out.println("-----Hiển thị thông tin sản phẩm--------");
            System.out.println("-----------------------------------------");
            System.out.println("1. Hiển thị tất cả các sản phẩm Sách");
            System.out.println("2. Hiển thị tất cả các sản phẩm Đồ dùng học tập");
            System.out.println("3. Hiển thị tất cả các sản phẩm Đồ chơi trẻ em");
            System.out.println("4. Hiển thị tất cả các sản phẩm có trong nhà Sách");
            System.out.println("5. Thoat");
            index = scanner.nextInt();
            switch (index){
                case 1:
                    sanPhams.hienThiTatCaSach();
                    break;
                case 2:
                    sanPhams.hienThiTatCaDoDungHocTap();
                    break;
                case 3:
                    sanPhams.hienThiTatDoChoiTreEm();
                    break;
                case 4:
                    sanPhams.hienThiTatCaSanPham();
                case 5:
                    return;
            }
        }
    }

    private void menuThemDonHang() {
        HoaDon hoaDon = new HoaDon();
        hoaDon = hoaDon.themMoiHoaDon();
        hoaDons.themHoaDon(hoaDon);
        System.out.println("Them thanh cong!");
    }

    private void menuThemSanPham() {
        int index ;
        while (true){
            System.out.println("----------------------------");
            System.out.println("-------Thêm sản phẩm---------");
            System.out.println("----------------------------");
            System.out.println("1. Thêm các sản phẩm Sách");
            System.out.println("2. Thêm các sản phẩm Đồ dùng học tập");
            System.out.println("3. Thêm các sản phẩm Đồ chơi trẻ em");
            System.out.println("4. Thoat");

            index = scanner.nextInt();
            switch (index){
                case 1:
                    System.out.println("----------------------------");
                    System.out.println("-------Thêm sản phẩm sach---------");
                    System.out.println("----------------------------");
                    Sach sach = new Sach();
                    try {
                        sach = sach.themSach();
                        sanPhams.themSanPham(sach);
                        System.out.println("Them thanh cong!");
                        sach.luuVaoFile();

                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("-------Thêm sản phẩm do dung hoc tap---------");
                    System.out.println("--------------------------------------------");
                    try {
                        sanPhams.themSanPham(new DoDungHocTap().themDoDungHocTap());
                        System.out.println("Them thanh cong!");
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;

                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("-------Thêm sản phẩm do choi tre em---------");
                    System.out.println("--------------------------------------------");
                    try {
                        sanPhams.themSanPham(new DoChoiTreEm().themDoChoiTreEm());
                        System.out.println("Them thanh cong!");
                    } catch (Exception e){
                        System.out.println(e);
                    }
                    break;
                case 4:
                    return;
            }
        }
    }

    public void luuVaoFile(SanPham sanPham){
        String tenFile = "";
        String name = "";
        if (sanPham instanceof SanPham){
            tenFile = "src\\file\\Sach.svc";
            name = "Sach";
        } else if (sanPham instanceof DoDungHocTap) {
            tenFile = "src\\file\\DoDungHocTap.svc";
            name = "DoDungHocTap";
        } else if (sanPham instanceof DoChoiTreEm) {
            tenFile = "src\\file\\DoChoiTreEm.svc";
            name = "DoChoiTreEm";
        } else {
            System.out.println("(Error) Khong thuoc loai san pham nao. Thoat!!!");
            return;
        }

        try {
            File file = new File(tenFile);
            if (!file.exists())
                if (file.createNewFile()){
                    System.out.println("--------Create new file "+ name +".csv------");
                }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(this.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file "+name+".csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }

    public void luuVaoFile(HoaDon hoaDon){
        String tenFile = "src\\file\\HoaDon.svc";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file HoaDon.csv------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(hoaDon.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file HoaDon.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }

    public void luuVaoFile(KhachHang khachHang){
        String tenFile = "src\\file\\KhachHang.svc";
        try {
            File file = new File(tenFile);
            if (file.createNewFile()){
                System.out.println("--------Create new file KhachHang vào KhachHang.csv------");
            }
            FileWriter fileWriter = new FileWriter(tenFile);

            fileWriter.write(khachHang.toString());

            fileWriter.close();
            System.out.println("--------Đã ghi Sach vào file KhachHang.csv-------");

        } catch (Exception e){
            System.out.println("----------------------");
            System.out.println(e);
            System.out.println("-----------------------");
        }
    }


}
