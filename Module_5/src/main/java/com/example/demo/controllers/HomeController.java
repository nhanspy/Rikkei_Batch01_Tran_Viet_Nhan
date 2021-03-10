package com.example.demo.controllers;

import com.example.demo.entites.NhanVien;
import com.example.demo.services.NhanVienServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/api")
public class HomeController {

    @Autowired
    NhanVienServiceImpl nhanVienService;

    @GetMapping("/home")
    public String home(){
        return "index";
    }

    @GetMapping("/nhanvien")
    public String viewNhanVien(Model model){
        List<NhanVien> nhanViens = nhanVienService.getAll();
        model.addAttribute("nhanViens", nhanViens);
        for (NhanVien nhanVien :
                nhanViens) {
            nhanViens.indexOf(nhanVien);
        }
        return "nhanvien";
    }

    @RequestMapping("/new")
    public String showNewNhanVienPage(Model model) {
        NhanVien nhanVien = new NhanVien();
        model.addAttribute("nhanVien", nhanVien);

        return "new_nhanvien";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveNhanVien(@ModelAttribute("nhanVien") NhanVien nhanVien) {
        nhanVienService.save(nhanVien);
        return "redirect:/api/nhanvien";
    }

    @RequestMapping("/edit/{MaNhanVien}")
    public ModelAndView showEditProductPage(@PathVariable(name = "MaNhanVien") String MaNhanVien) {
        ModelAndView mav = new ModelAndView("edit_nhanvien.html");
        NhanVien nhanVien = nhanVienService.get(MaNhanVien);
        mav.addObject("nhanVien",  nhanVien);

        return mav;
    }

    @RequestMapping("/delete/{MaNhanVien}")
    public String deleteProduct(@PathVariable(name = "MaNhanVien") String MaNhanVien) {
        nhanVienService.delete(MaNhanVien);
        return "redirect:/api/nhanvien";
    }
}
