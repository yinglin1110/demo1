package com.dubbo.service.service;

import com.dubbo.service.dao.IUserDao;
import com.dubbo.entity.User;
import com.dubbo.service.facade.IUserApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by admin on 2018/7/19
 */
@Service
public class UserApiImpl implements IUserApi {

    @Autowired
    private IUserDao userDao;

    public User findUserById(long id) {
        return userDao.findUserById(id);
    }

    public int insertUser(User user) {
        return userDao.insertUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUserById(long id) {
        return userDao.deleteUserById(id);
    }
}
