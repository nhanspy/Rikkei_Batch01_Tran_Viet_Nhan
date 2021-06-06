import {TinhThanh} from './TinhThanh.class';

export class Ben {
  private _maBen: string;
  private _tenBen: string;
  private _maTinh: string;
  private _tenTinh: string;
  private _tinhThanh: TinhThanh;


  constructor(maBen: string, tenBen: string, maTinh: string, tenTinh: string, tinhThanh: TinhThanh) {
    this._maBen = maBen;
    this._tenBen = tenBen;
    this._maTinh = maTinh;
    this._tenTinh = tenTinh;
    this._tinhThanh = tinhThanh;
  }


  get tinhThanh(): TinhThanh {
    return this._tinhThanh;
  }

  set tinhThanh(value: TinhThanh) {
    this._tinhThanh = value;
  }

  get tenTinh(): string {
    return this._tenTinh;
  }

  set tenTinh(value: string) {
    this._tenTinh = value;
  }

  get maBen(): string {
    return this._maBen;
  }

  set maBen(value: string) {
    this._maBen = value;
  }

  get tenBen(): string {
    return this._tenBen;
  }

  set tenBen(value: string) {
    this._tenBen = value;
  }

  get maTinh(): string {
    return this._maTinh;
  }

  set maTinh(value: string) {
    this._maTinh = value;
  }
}
