package com.shop.dao;

import com.shop.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    public List<Product> getAllProducts() {
        return (List<Product>)getSession().createQuery("from Product").list();
    }

    public void save(Product product) {
        Date now = new Date();
        product.setDateAdd(now);
        product.setDateUpdate(now);
        product.setOwnerName(getPrincipal());//setOwnerName("user");//
       getSession().persist(product);
    }

    public void update(Product product) {
        Date now = new Date();
        product.setDateUpdate(now);
        getSession().update(product);
    }

    public void delete(Product product) {
        getSession().delete(product);
    }

    public Product getById(int id) {
        return (Product)getSession().get(Product.class, id);
    }

    private String getPrincipal(){
        String userName = null;
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof UserDetails){
            userName = ((UserDetails)principal).getUsername();
        }else{
            userName = principal.toString();
        }
        return userName;
    }
}
