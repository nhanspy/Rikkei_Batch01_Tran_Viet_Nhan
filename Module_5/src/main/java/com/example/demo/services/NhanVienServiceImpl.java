package com.example.demo.services;

import com.example.demo.entites.NhanVien;
import com.example.demo.repositories.NhanVienRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhanVienServiceImpl {

    @Autowired
    private NhanVienRepository repository;

    public void save(NhanVien nhanVien) {
        repository.save(nhanVien);
    }

    public NhanVien get(String id) {
        return repository.findById(id).get();
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public List<NhanVien> getAll() {
        return repository.findAll();
    }
}
