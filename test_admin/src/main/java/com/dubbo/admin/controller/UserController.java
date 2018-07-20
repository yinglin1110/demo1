package com.dubbo.admin.controller;

import com.alibaba.fastjson.JSON;
import com.dubbo.entity.User;
import com.dubbo.service.facade.IUserApi;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Create by admin on 2018/7/19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private IUserApi userApi;

    @GetMapping("/get/{id}")
    @ApiOperation(value="根据id查询用户")
    @ApiImplicitParam(name="id",value="用户id",required = true)
    public User findUserById(@PathVariable long id) {
        User user = userApi.findUserById(id);
        System.out.println(JSON.toJSONString(user).toString());
        return user;
    }

    @PostMapping("/add")
    @ApiOperation(value="添加用户")
    @ApiImplicitParam(name="user",value="用户对象",required = true)
    public int saveUser(@RequestBody User user) {
        return userApi.insertUser(user);
    }

    @PutMapping("/update")
    @ApiOperation(value="更新用户")
    @ApiImplicitParam(name="user",value="用户对象",required = true)
    public int updateUser(@RequestBody User user) {
        return userApi.updateUser(user);
    }

    @DeleteMapping("/delete/{id}")
    @ApiOperation(value="删除用户")
    @ApiImplicitParam(name="id",value="用户id",required = true)
    public int deleteUserById(@PathVariable long id) {
        return userApi.deleteUserById(id);
    }
}
