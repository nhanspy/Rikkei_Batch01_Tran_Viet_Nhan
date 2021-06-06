package com.rtep.learnqrcode.services;

import com.rtep.learnqrcode.entities.Product;

public interface ProductService {

    public Iterable<Product> findAll();

}