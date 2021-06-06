package com.rtep.learnqrcode.repositories;

import com.rtep.learnqrcode.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, String> {
}