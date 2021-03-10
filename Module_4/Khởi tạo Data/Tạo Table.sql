CREATE DATABASE QL_SP_NhaSachNhaNam;

CREATE TABLE DMSach
(
    MaDMSach VARCHAR(45) NOT NULL ,
    TheLoai VARCHAR(45),
    MoTa VARCHAR(200),
    PRIMARY KEY (MaDMSach)
);


CREATE TABLE DMDoChoi
(
    MaDMDoChoi VARCHAR(45) NOT NULL ,
    Nhom VARCHAR(45),
    MoTa VARCHAR(200),
    PRIMARY KEY (MaDMDoChoi)
);

CREATE TABLE DMDungCu
(
    MaDMDungCu VARCHAR(45) NOT NULL ,
    Khoi VARCHAR(45),
    MoTa VARCHAR(200),
    PRIMARY KEY (MaDMDungCu)
);

CREATE TABLE SanPhamSach
(
    MaSPSach VARCHAR(45) NOT NULL PRIMARY KEY ,
    TenSPSach VARCHAR(200),
    SoLuong INT,
    DonGia FLOAT,
    DonVi VARCHAR(10),
    MaDMSach VARCHAR(45),
    NhaXuatBan VARCHAR(200),
    NamXuatBan INT,
    TacGia VARCHAR(50),
    NgayXuatBan DATE,
    LanTaiBan INT,

    FOREIGN KEY (MaDMSach) REFERENCES DMSach(MaDMSach)
);

CREATE TABLE SanPhamDoChoi
(
    MaSPDoChoi VARCHAR(45) NOT NULL  PRIMARY KEY ,
    TenSPDoChoi VARCHAR(200),
    SoLuong INT,
    DonGia FLOAT,
    DonVi VARCHAR(10),
    MaDMDoChoi VARCHAR(45),
    XuatXu VARCHAR(200),
    ThuongHieu VARCHAR(200),
    NhaCungCap VARCHAR(200),
    HuongDan VARCHAR(500),

    FOREIGN KEY (MaDMDoChoi) REFERENCES DMDoChoi(MaDMDoChoi)
);

CREATE TABLE SanPhamDungCu
(
    MaSPDungCu VARCHAR(45) PRIMARY KEY NOT NULL ,
    TenSPDungCu VARCHAR(200),
    SoLuong INT,
    DonGia FLOAT,
    DonVi VARCHAR(10),
    MaDMDungCU VARCHAR(45),
    XuatXu VARCHAR(200),
    ThuongHieu VARCHAR(200),
    NhaCungCap VARCHAR(200),
    MauSac VARCHAR(50),
    KichThuoc FLOAT,
    ChatLieu VARCHAR(200),
    HuongDan VARCHAR(500),

    FOREIGN KEY (MaDMDungCU) REFERENCES DMDungCu(MaDMDungCu)
);

CREATE TABLE NhanVien
(
    MaNhanVien VARCHAR(45) NOT NULL PRIMARY KEY ,
    TenNhanVien VARCHAR(200),
    NgaySinh DATE,
    ViTri VARCHAR(200),
    SoDienThoai VARCHAR(12),
    Email VARCHAR(50),
    DiaChi VARCHAR(200)
);

CREATE TABLE LoaiKhachHang
(
    MaLoai VARCHAR(45) NOT NULL PRIMARY KEY ,
    TenLoai VARCHAR(200)
);

CREATE TABLE KhachHang
(
    MaKhachHang VARCHAR(45) NOT NULL PRIMARY KEY ,
    TenKhachHang VARCHAR(200),
    Email VARCHAR(200),
    SoDienThoai VARCHAR(15),
    NgaySinh DATE,
    MaLoai VARCHAR(45),

    FOREIGN KEY (MaLoai) REFERENCES LoaiKhachHang(MaLoai)
);
drop  table  KhachHang;

CREATE TABLE DonHang
(
    MaDonHang VARCHAR(45) NOT NULL PRIMARY KEY ,
    MaKhachHang VARCHAR(45) REFERENCES KhachHang(MaKhachHang),
    MaNhanVien VARCHAR(45) REFERENCES NhanVien(MaNhanVien),
    NgayMuaHang DATE,
    TongTien FLOAT
);

DROP TABLE ChiTietDonHang;
CREATE TABLE ChiTietDonHang
(
    MaDonHang VARCHAR(45) REFERENCES DonHang(MaDonHang),
    MaSanPham VARCHAR(45),
    SoLuong INT

#     CONSTRAINT fk_1 FOREIGN KEY (MaSanPham) REFERENCES SanPhamSach(MaSPSach),
#     CONSTRAINT fk_2 FOREIGN KEY (MaSanPham) REFERENCES SanPhamDungCu(MaSPDungCu)
#     CONSTRAINT fk_3 FOREIGN KEY (MaSanPham) REFERENCES SanPhamDoChoi(MaSPDoChoi)
);

