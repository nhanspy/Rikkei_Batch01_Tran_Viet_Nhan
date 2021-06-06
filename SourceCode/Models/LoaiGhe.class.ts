import {Ghe} from './Ghe.class';

export class LoaiGhe {
  private _maLoaiGhe: string;
  private _tenLoaiGhe: string;
  private _ghe: Ghe;

  constructor(maLoaiGhe: string, tenLoaiGhe: string, ghe: Ghe) {
    this._maLoaiGhe = maLoaiGhe;
    this._tenLoaiGhe = tenLoaiGhe;
    this._ghe = ghe;
  }

  get maLoaiGhe(): string {
    return this._maLoaiGhe;
  }

  set maLoaiGhe(value: string) {
    this._maLoaiGhe = value;
  }

  get tenLoaiGhe(): string {
    return this._tenLoaiGhe;
  }

  set tenLoaiGhe(value: string) {
    this._tenLoaiGhe = value;
  }

  get ghe(): Ghe {
    return this._ghe;
  }

  set ghe(value: Ghe) {
    this._ghe = value;
  }
}
