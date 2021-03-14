package com.example.demo.controllers;

import com.example.demo.entites.NhanVien;
import com.example.demo.services.NhanVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/abc")
public class ApiController {
    @Autowired
    NhanVienServiceImpl nhanVienService;

//    @GetMapping("/nhanvien")
//    public List<NhanVien> getNhanVien(){
//        List<NhanVien> nhanViens = nhanVienService.getAll();
////        model.addAttribute("nhanViens", nhanViens);
//        return nhanViens;
//    }
}
