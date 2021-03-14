import { Component, OnInit } from '@angular/core';
import {NhanVien} from '../NhanVien';
import {DSNhanVien} from "../DSNhanVien";

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit {
  dsNhanVien = new DSNhanVien();
  nhanViens = this.dsNhanVien.getNhanVien();
  constructor() { }

  ngOnInit(): void {
  }

}
