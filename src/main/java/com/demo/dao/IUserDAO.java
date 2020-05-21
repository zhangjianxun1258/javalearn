package com.demo.dao;

import com.demo.pojo.User;

public interface IUserDAO {
    User selectUserById(Long id);
}
