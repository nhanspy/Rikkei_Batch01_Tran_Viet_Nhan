export class TaiKhoan {
  private _maTaiKhoan: string;
  private _maLoai: string;
  private _ten: string;
  private _soDienThoai: string;
  private _ngaySinh: string;
  private _diaChi: string;
  private _gioiTinh: number;
  private _taiKhoan: string;
  private _matKhau: string;

  constructor(maTaiKhoan: string, maLoai: string, ten: string, soDienThoai: string, ngaySinh: string, diaChi: string, gioiTinh: number, taiKhoan: string, matKhau: string) {
    this._maTaiKhoan = maTaiKhoan;
    this._maLoai = maLoai;
    this._ten = ten;
    this._soDienThoai = soDienThoai;
    this._ngaySinh = ngaySinh;
    this._diaChi = diaChi;
    this._gioiTinh = gioiTinh;
    this._taiKhoan = taiKhoan;
    this._matKhau = matKhau;
  }


  get maTaiKhoan(): string {
    return this._maTaiKhoan;
  }

  set maTaiKhoan(value: string) {
    this._maTaiKhoan = value;
  }

  get maLoai(): string {
    return this._maLoai;
  }

  set maLoai(value: string) {
    this._maLoai = value;
  }

  get ten(): string {
    return this._ten;
  }

  set ten(value: string) {
    this._ten = value;
  }

  get soDienThoai(): string {
    return this._soDienThoai;
  }

  set soDienThoai(value: string) {
    this._soDienThoai = value;
  }

  get ngaySinh(): string {
    return this._ngaySinh;
  }

  set ngaySinh(value: string) {
    this._ngaySinh = value;
  }

  get diaChi(): string {
    return this._diaChi;
  }

  set diaChi(value: string) {
    this._diaChi = value;
  }

  get gioiTinh(): number {
    return this._gioiTinh;
  }

  set gioiTinh(value: number) {
    this._gioiTinh = value;
  }

  get taiKhoan(): string {
    return this._taiKhoan;
  }

  set taiKhoan(value: string) {
    this._taiKhoan = value;
  }

  get matKhau(): string {
    return this._matKhau;
  }

  set matKhau(value: string) {
    this._matKhau = value;
  }
}
