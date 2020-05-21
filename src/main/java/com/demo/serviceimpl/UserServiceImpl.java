package com.demo.serviceimpl;

import com.demo.dao.IUserDAO;
import com.demo.pojo.User;
import com.demo.sdk.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userSerivce")
public class UserServiceImpl implements IUserService {
    @Autowired
    private IUserDAO iUserDAO;

    @Override
    public User getUser(Long id) {
        return iUserDAO.selectUserById(id);
    }
}
