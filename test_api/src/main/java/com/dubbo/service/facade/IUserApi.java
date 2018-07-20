package com.dubbo.service.facade;

import com.dubbo.entity.User;

/**
 * Create by admin on 2018/7/19
 */
public interface IUserApi {
    User findUserById(long id);

    int insertUser(User user);

    int updateUser(User user);

    int deleteUserById(long id);


}
