package com.shop.service;

import com.shop.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void update(User user);
    void delete(int id);
    User getById(int id);
    void save (User user);
}
