package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public int save(User user) {
        System.out.println("UserServiceImpl save:" + user.toString());
        return userDao.save(user);
    }

    public int update(User user) {
        System.out.println("UserServiceImpl update:" + user.toString());
        return userDao.update(user);
    }

    public int delete(Integer id) {
        System.out.println("UserServiceImpl delete: id = " + id);
        return userDao.delete(id);
    }

    public User getById(Integer id) {
        System.out.println("UserServiceImpl getById: id = " + id);
        return userDao.getById(id);
    }

    public List<User> getAll() {
        System.out.println("UserServiceImpl getAll");
        return userDao.getAll();
    }
}
