export class NhanVien{
  MaNhanVien: string;
  TenNhanVien: string;
  NgaySinh: string;
  ViTri: string;
  SDT: string;
  Email: string;
  DiaChi: string;

  constructor() {
    this.MaNhanVien = '101';
    this.TenNhanVien = 'ABC';
    this.NgaySinh = '1-1-2021';
    this.ViTri = 'coder';
    this.SDT = '00000000';
    this.Email = 'abc@xyz.com';
    this.DiaChi = 'Da Nang';
  }

  // tslint:disable-next-line:typedef ban-types
  // initNhanVien(Object: object) {
  //   // // @ts-ignore
  //   // this.MaNhanVien = Object.MaNhanVien;
  //   // // @ts-ignore
  //   // this.TenNhanVien = Object.TenNhanVien;
  //   // // @ts-ignore
  //   // this.NgaySinh = Object.NgaySinh;
  //   // // @ts-ignore
  //   // this.ViTri = Object.ViTri;
  //   // // @ts-ignore
  //   // this.SDT = Object.SDT;
  //   // // @ts-ignore
  //   // this.Email = Object.Email;
  //   // // @ts-ignore
  //   // this.DiaChi = Object.DiaChi;
  // }
}
