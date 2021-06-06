import {Ghe} from './Ghe.class';
import {ChuyenXe} from './ChuyenXe.class';
import {User} from './User.class';

export class VeXe {
  // tslint:disable-next-line:variable-name
  private _maVe: string;
  // @ts-ignore
  // tslint:disable-next-line:variable-name
  private _thoiGian: string;
  // @ts-ignore
  // tslint:disable-next-line:variable-name
  private _giaTien: string;
  // @ts-ignore
  // tslint:disable-next-line:variable-name
  private _ghe: Ghe;
  // @ts-ignore
  // tslint:disable-next-line:variable-name
  private _chuyenXe: ChuyenXe;
  // @ts-ignore
  // tslint:disable-next-line:variable-name
  private _userNguoiDung: User;
  // @ts-ignore
  // tslint:disable-next-line:variable-name
  private _userNhaXe: User;

  constructor(maVe: string, thoiGian: string, giaTien: string, ghe: Ghe, chuyenXe: ChuyenXe) {
    this._maVe = maVe;
    this._thoiGian = thoiGian;
    this._giaTien = giaTien;
    this._ghe = ghe;
    this._chuyenXe = chuyenXe;
  }

  get userNguoiDung(): User {
    return this._userNguoiDung;
  }

  set userNguoiDung(value: User) {
    this._userNguoiDung = value;
  }

  get userNhaXe(): User {
    return this._userNhaXe;
  }

  set userNhaXe(value: User) {
    this._userNhaXe = value;
  }

  get maVe(): string {
    return this._maVe;
  }

  set maVe(value: string) {
    this._maVe = value;
  }

  get thoiGian(): string {
    return this._thoiGian;
  }

  set thoiGian(value: string) {
    this._thoiGian = value;
  }

  get giaTien(): string {
    return this._giaTien;
  }

  set giaTien(value: string) {
    this._giaTien = value;
  }

  get ghe(): Ghe {
    return this._ghe;
  }

  set ghe(value: Ghe) {
    this._ghe = value;
  }

  get chuyenXe(): ChuyenXe {
    return this._chuyenXe;
  }

  set chuyenXe(value: ChuyenXe) {
    this._chuyenXe = value;
  }
}
