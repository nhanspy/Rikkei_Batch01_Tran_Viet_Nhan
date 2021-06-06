import {Xe} from './Xe.class';

export class LoaiXe {
  private _maLoaiXe: string;
  private _tenLoaiXe: string;
  private _xe: Xe;

  constructor(maLoaiXe: string, tenLoaiXe: string, xe: Xe) {
    this._maLoaiXe = maLoaiXe;
    this._tenLoaiXe = tenLoaiXe;
    this._xe = xe;
  }

  get maLoaiXe(): string {
    return this._maLoaiXe;
  }

  set maLoaiXe(value: string) {
    this._maLoaiXe = value;
  }

  get tenLoaiXe(): string {
    return this._tenLoaiXe;
  }

  set tenLoaiXe(value: string) {
    this._tenLoaiXe = value;
  }

  get xe(): Xe {
    return this._xe;
  }

  set xe(value: Xe) {
    this._xe = value;
  }
}
