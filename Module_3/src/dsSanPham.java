import java.util.ArrayList;
import java.util.Iterator;

public class dsSanPham {
    ArrayList<SanPham> sanPhams;

    public dsSanPham() {
        sanPhams = new ArrayList<>();
    }

    public ArrayList<SanPham> getSanPhams() {
        return sanPhams;
    }

    public void setSanPhams(ArrayList<SanPham> sanPhams) {
        this.sanPhams = sanPhams;
    }

    public void themSanPham(SanPham sanPham){
        this.sanPhams.add(sanPham);
    }

    public void xoaSanPham(SanPham sanPham){
        this.sanPhams.remove(sanPham);
    }

    public SanPham timSanPhamTheoMaSP(String maSP){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham.getMaSp() == maSP){
                return sanPham;
            }
        }
        return null;
    }

    public void hienThiTatCaSanPham(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            sanPham.hienThiThongTin();
        }
    }

    public void hienThiTatCaSach(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham instanceof Sach)
                sanPham.hienThiThongTin();
        }
    }

    public void hienThiTatDoChoiTreEm(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham instanceof DoChoiTreEm)
                sanPham.hienThiThongTin();
        }
    }

    public void luuCacSanPhamSach(){
        for (SanPham sanPham :
                sanPhams) {
            if (sanPham instanceof Sach)
                sanPham.luuVaoFile();
        }
    }

    public void hienThiTatCaDoDungHocTap(){
        Iterator<SanPham> iterator = getSanPhams().iterator();
        SanPham sanPham;
        while (iterator.hasNext()){
            sanPham = iterator.next();
            if (sanPham instanceof DoDungHocTap)
                sanPham.hienThiThongTin();
        }
    }

    public void luuTatCaVaoFile(){
        for (SanPham sanPham :
                sanPhams) {
            sanPham.luuVaoFile();
        }
    }

    public void luuTatCaDoChoiTreEmVaoFile(){
        for (SanPham sanPham :
                sanPhams) {
            if (sanPham instanceof DoChoiTreEm)
            sanPham.luuVaoFile();
        }
    }

    public void luuTatCaDoDungHocTapVaoFile(){
        for (SanPham sanPham :
                sanPhams) {
            if (sanPham instanceof DoDungHocTap)
                sanPham.luuVaoFile();
        }
    }
}
