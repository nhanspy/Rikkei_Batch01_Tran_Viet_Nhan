import {LoaiGhe} from './LoaiGhe.class';
import {TrangThaiGhe} from './TrangThaiGhe.class';
import {VeXe} from './VeXe.class';
import {Xe} from './Xe.class';

export class Ghe {
  private _maGhe: string;
  private _tenGhe: string;
  private _loaiGhe: LoaiGhe;
  private _trangThaiGhe: TrangThaiGhe;
  private _veXe: VeXe;
  private _xe: Xe;

  constructor(maGhe: string, tenGhe: string, loaiGhe: LoaiGhe, trangThaiGhe: TrangThaiGhe, veXe: VeXe, xe: Xe) {
    this._maGhe = maGhe;
    this._tenGhe = tenGhe;
    this._loaiGhe = loaiGhe;
    this._trangThaiGhe = trangThaiGhe;
    this._veXe = veXe;
    this._xe = xe;
  }

  get maGhe(): string {
    return this._maGhe;
  }

  set maGhe(value: string) {
    this._maGhe = value;
  }

  get tenGhe(): string {
    return this._tenGhe;
  }

  set tenGhe(value: string) {
    this._tenGhe = value;
  }

  get loaiGhe(): LoaiGhe {
    return this._loaiGhe;
  }

  set loaiGhe(value: LoaiGhe) {
    this._loaiGhe = value;
  }

  get trangThaiGhe(): TrangThaiGhe {
    return this._trangThaiGhe;
  }

  set trangThaiGhe(value: TrangThaiGhe) {
    this._trangThaiGhe = value;
  }

  get veXe(): VeXe {
    return this._veXe;
  }

  set veXe(value: VeXe) {
    this._veXe = value;
  }

  get xe(): Xe {
    return this._xe;
  }

  set xe(value: Xe) {
    this._xe = value;
  }
}
