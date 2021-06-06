import {Ben} from './Ben.class';

export class TinhThanh {
  private _maTinh: string;
  private _tenTinh: string;
  private _ben: Ben;

  constructor(maTinh: string, tenTinh: string, ben: Ben) {
    this._maTinh = maTinh;
    this._tenTinh = tenTinh;
    this._ben = ben;
  }

  get maTinh(): string {
    return this._maTinh;
  }

  set maTinh(value: string) {
    this._maTinh = value;
  }

  get tenTinh(): string {
    return this._tenTinh;
  }

  set tenTinh(value: string) {
    this._tenTinh = value;
  }

  get ben(): Ben {
    return this._ben;
  }

  set ben(value: Ben) {
    this._ben = value;
  }
}
