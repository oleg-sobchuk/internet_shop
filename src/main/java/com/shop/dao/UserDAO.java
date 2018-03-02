package com.shop.dao;

import com.shop.entity.User;
import java.util.List;

public interface UserDAO {
    List<User> findAll();
    void update(User user);
    void delete(int id);
    User getById(int id);
    void save (User user);
}
