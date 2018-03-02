package com.shop.service;

import com.shop.dao.UserDAO;
import com.shop.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDAO userDao;

    public List<User> findAll() {
        return userDao.findAll();
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void delete(int id) {
        userDao.delete(id);
    }

    public User getById(int id) {
        return userDao.getById(id);
    }

    public void save(User user) {
        userDao.save(user);
    }
}
