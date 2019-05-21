/*
 * 文件名：UserService.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年3月8日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.entity.Result;
import com.tmall.entity.User;
import com.tmall.mapper.UserMapper;
import com.tmall.util.EncryptDecryptUtil;
@Service
public class UserService
{
    @Autowired
    UserMapper userMapper;
    public List<User> getAllUsers()
    {
        return userMapper.getUsers();
    }
    
    public User getUser(User user)
    {
        return userMapper.getUser(user);
    }
    
    public User getUser(String userName)
    {
        return userMapper.getUser(userName);
    }
    public Result addUser(User user)
    {
        User existUser = userMapper.getUser(user);
        if(existUser==null)
        {
            String password=user.getUserPassword();
            user.setUserPassword(EncryptDecryptUtil.md5(password));
            userMapper.addUser(user);
            return Result.success();
        }
        else
        {
            return new Result("false","账号已注册");
        }
        
    }
}
