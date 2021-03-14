import {NhanVien} from './NhanVien';

export class DSNhanVien{
  nhanViens: NhanVien[] = [
    {MaNhanVien: 'nhanvien1', TenNhanVien: 'Nguyễn Văn Hồng', NgaySinh: '2020-01-01', ViTri: 'Coder' , SDT: '098765432', Email: 'vanhong@rtep.com', DiaChi: 'Da Nang'},
    {MaNhanVien: 'nhanvien1', TenNhanVien: 'Nguyễn Văn Hồng', NgaySinh: '2020-01-01', ViTri: 'Coder' , SDT: '098765432', Email: 'vanhong@rtep.com', DiaChi: 'Da Nang'},
    {MaNhanVien: 'nhanvien1', TenNhanVien: 'Nguyễn Văn Hồng', NgaySinh: '2020-01-01', ViTri: 'Coder' , SDT: '098765432', Email: 'vanhong@rtep.com', DiaChi: 'Da Nang'},
    {MaNhanVien: 'nhanvien1', TenNhanVien: 'Nguyễn Văn Hồng', NgaySinh: '2020-01-01', ViTri: 'Coder' , SDT: '098765432', Email: 'vanhong@rtep.com', DiaChi: 'Da Nang'},
    {MaNhanVien: 'nhanvien1', TenNhanVien: 'Nguyễn Văn Hồng', NgaySinh: '2020-01-01', ViTri: 'Coder' , SDT: '098765432', Email: 'vanhong@rtep.com', DiaChi: 'Da Nang'},
  ];

  // tslint:disable-next-line:typedef
  getNhanVien(){
    return this.nhanViens;
  }

  // tslint:disable-next-line:typedef
  themNhanVien(nhanVien: NhanVien){
    this.nhanViens.push(nhanVien);
  }

  // tslint:disable-next-line:typedef
  timNhanVien(maNhanVien: string){
    for (const nhanVien of this.nhanViens){
      if (nhanVien.MaNhanVien === maNhanVien) {
        return nhanVien;
      }
    }
    return null;
  }
}
