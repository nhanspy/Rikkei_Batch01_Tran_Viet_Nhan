public abstract class SanPham {
    String maSp, tenSP, thuocDanhMuc;
    protected int soLuong;
    protected float donGia;

    public SanPham() {
    }

    public SanPham(String maSp, String tenSP, String thuocDanhMuc, int soLuong, float donGia) {
        this.maSp = maSp;
        this.tenSP = tenSP;
        this.thuocDanhMuc = thuocDanhMuc;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getThuocDanhMuc() {
        return thuocDanhMuc;
    }

    public void setThuocDanhMuc(String thuocDanhMuc) {
        this.thuocDanhMuc = thuocDanhMuc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public abstract void hienThiThongTin();
    public abstract void phanTramGiamGia(String loaiKhachHang);
    public abstract void luuVaoFile();
}
