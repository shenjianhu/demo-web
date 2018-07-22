package com.hsj.user.dao;

import com.hsj.user.entity.User;

public interface UserDao {

    public User getUserById(Integer id);

    public User login(User user);
}
