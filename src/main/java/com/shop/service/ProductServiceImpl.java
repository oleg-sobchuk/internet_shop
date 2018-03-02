package com.shop.service;

import com.shop.dao.ProductDao;
import com.shop.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {

    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao){
        this.productDao=productDao;
    }

    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    public void save(Product product) {
        productDao.save(product);
    }

    public void update(Product product) {
        productDao.update(product);
    }

    public void delete(Product product) {
        productDao.delete(product);
    }

    public Product getById(int id) {
        return productDao.getById(id);
    }
}
