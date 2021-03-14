import { Component, OnInit } from '@angular/core';
import {NhanVien} from '../NhanVien';
import {DSNhanVien} from '../DSNhanVien';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html',
  styleUrls: ['./body.component.css']
})
export class BodyComponent implements OnInit {
  nhanViens = new DSNhanVien().nhanViens;
  constructor() { }

  ngOnInit(): void {
  }

}
