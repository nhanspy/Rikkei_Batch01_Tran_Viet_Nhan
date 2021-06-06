import {Xe} from './Xe.class';

export class NhaXe {
  private _maNhaXe: string;
  private _tenNhaXe: string;
  private _xe: Xe;

  constructor(maNhaXe: string, tenNhaXe: string, xe: Xe) {
    this._maNhaXe = maNhaXe;
    this._tenNhaXe = tenNhaXe;
    this._xe = xe;
  }

  get maNhaXe(): string {
    return this._maNhaXe;
  }

  set maNhaXe(value: string) {
    this._maNhaXe = value;
  }

  get tenNhaXe(): string {
    return this._tenNhaXe;
  }

  set tenNhaXe(value: string) {
    this._tenNhaXe = value;
  }

  get xe(): Xe {
    return this._xe;
  }

  set xe(value: Xe) {
    this._xe = value;
  }
}
