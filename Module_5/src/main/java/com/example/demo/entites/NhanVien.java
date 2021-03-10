package com.example.demo.entites;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="nhan_vien")
public class NhanVien {
    @Id
    @Column(name = "ma_nhan_vien", nullable = false)
    private String MaNhanVien;
    @Column(name = "ten_nhan_vien")
    private String TenNhanVien;
    @Column(name = "ngay_sinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date NgaySinh;
    @Column(name = "vi_tri")
    private String ViTri;
    @Column(name = "so_dien_thoai")
    private String SoDienThoai;
    @Column(name = "email")
    private String Email;
    @Column(name = "dia_chi")
    private String DiaChi;

    public NhanVien() {
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        MaNhanVien = maNhanVien;
    }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        TenNhanVien = tenNhanVien;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getViTri() {
        return ViTri;
    }

    public void setViTri(String viTri) {
        ViTri = viTri;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        SoDienThoai = soDienThoai;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String diaChi) {
        DiaChi = diaChi;
    }

    public NhanVien(String maNhanVien, String tenNhanVien, Date ngaySinh, String viTri, String soDienThoai, String email, String diaChi) {
        MaNhanVien = maNhanVien;
        TenNhanVien = tenNhanVien;
        NgaySinh = ngaySinh;
        ViTri = viTri;
        SoDienThoai = soDienThoai;
        Email = email;
        DiaChi = diaChi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "MaNhanVien='" + MaNhanVien + '\'' +
                ", TenNhanVien='" + TenNhanVien + '\'' +
                ", NgaySinh=" + NgaySinh +
                ", ViTri='" + ViTri + '\'' +
                ", SoDienThoai='" + SoDienThoai + '\'' +
                ", Email='" + Email + '\'' +
                ", DiaChi='" + DiaChi + '\'' +
                '}';
    }
}
