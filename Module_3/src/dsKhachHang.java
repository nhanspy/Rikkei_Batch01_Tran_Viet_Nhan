import java.util.ArrayList;

public class dsKhachHang {
    ArrayList<KhachHang> khachHangs;

    public dsKhachHang() {
        khachHangs = new ArrayList<>();
    }

    public void luuTatCaKhachHangVaoFile(){
        for (KhachHang khachHang :
                khachHangs) {
            khachHang.luuVaoFile();
        }
    }
}
