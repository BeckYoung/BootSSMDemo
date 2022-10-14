package com.example.service;

import com.example.domain.User;

import java.util.List;

public interface UserService {
    int save(User user);
    int update(User user);
    int delete(Integer id);
    User getById(Integer id);
    List<User> getAll();
}
