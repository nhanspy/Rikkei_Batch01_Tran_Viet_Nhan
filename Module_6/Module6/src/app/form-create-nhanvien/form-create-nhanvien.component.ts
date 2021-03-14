import { Component, OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';
import {NhanVien} from '../NhanVien';
import {DSNhanVien} from '../DSNhanVien';

@Component({
  selector: 'app-form-create-nhanvien',
  templateUrl: './form-create-nhanvien.component.html',
  styleUrls: ['./form-create-nhanvien.component.css']
})
export class FormCreateNhanvienComponent implements OnInit {

  constructor() { }

  nhanVien = new NhanVien();
  nhanViens = new DSNhanVien();

  ngOnInit(): void {
  }

  // tslint:disable-next-line:typedef
  onSubmit(createNhanVienForm: NgForm) {
    this.nhanViens.themNhanVien(this.nhanVien);
    console.log(this.nhanViens);
    alert('Them thanh cong');
  }
}
