package com.hsj.user.impl;

import com.hsj.user.UserService;
import com.hsj.user.dao.UserDao;
import com.hsj.user.entity.User;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User login(User user) {
        return userDao.login(user);
    }
}
