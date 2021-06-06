import {Ghe} from './Ghe.class';
import {ChuyenXe} from './ChuyenXe.class';
import {NhaXe} from './NhaXe.class';
import {LoaiXe} from './LoaiXe.class';

export class Xe {
  private _maXe: string;
  private _bienSoXe: string;
  private _ghe: Ghe;
  private _chuyenXe: ChuyenXe;
  private _nhaXe: NhaXe;
  private _loaiXe: LoaiXe;

  constructor(maXe: string, bienSoXe: string, ghe: Ghe, chuyenXe: ChuyenXe, nhaXe: NhaXe, loaiXe: LoaiXe) {
    this._maXe = maXe;
    this._bienSoXe = bienSoXe;
    this._ghe = ghe;
    this._chuyenXe = chuyenXe;
    this._nhaXe = nhaXe;
    this._loaiXe = loaiXe;
  }

  get maXe(): string {
    return this._maXe;
  }

  set maXe(value: string) {
    this._maXe = value;
  }

  get bienSoXe(): string {
    return this._bienSoXe;
  }

  set bienSoXe(value: string) {
    this._bienSoXe = value;
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

  get nhaXe(): NhaXe {
    return this._nhaXe;
  }

  set nhaXe(value: NhaXe) {
    this._nhaXe = value;
  }

  get loaiXe(): LoaiXe {
    return this._loaiXe;
  }

  set loaiXe(value: LoaiXe) {
    this._loaiXe = value;
  }
}
