import {Ghe} from './Ghe.class';

export class TrangThaiGhe {
  private _maTrangThai: string;
  private _tenTrangThai: string;
  private _ghe: Ghe;

  constructor(maTrangThai: string, tenTrangThai: string, ghe: Ghe) {
    this._maTrangThai = maTrangThai;
    this._tenTrangThai = tenTrangThai;
    this._ghe = ghe;
  }

  get maTrangThai(): string {
    return this._maTrangThai;
  }

  set maTrangThai(value: string) {
    this._maTrangThai = value;
  }

  get tenTrangThai(): string {
    return this._tenTrangThai;
  }

  set tenTrangThai(value: string) {
    this._tenTrangThai = value;
  }

  get ghe(): Ghe {
    return this._ghe;
  }

  set ghe(value: Ghe) {
    this._ghe = value;
  }
}
