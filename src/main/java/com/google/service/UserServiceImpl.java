package com.google.service;

import com.google.mapper.UserMapper;
import com.google.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
