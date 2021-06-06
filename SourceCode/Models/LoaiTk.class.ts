export class LoaiTk {
  private _maLoai: string
  private _tenLoai: string;

  constructor(maLoai: string, tenLoai: string) {
    this._maLoai = maLoai;
    this._tenLoai = tenLoai;
  }

  get maLoai(): string {
    return this._maLoai;
  }

  set maLoai(value: string) {
    this._maLoai = value;
  }

  get tenLoai(): string {
    return this._tenLoai;
  }

  set tenLoai(value: string) {
    this._tenLoai = value;
  }
}
