package com.shop.service;

import com.shop.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void save(Product product);
    void update (Product product);
    void delete(Product product);
    Product getById(int id);
}
