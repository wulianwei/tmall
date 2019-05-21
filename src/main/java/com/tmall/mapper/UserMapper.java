/*
 * 文件名：UserMapper.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年3月8日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tmall.entity.User;


public interface UserMapper
{
    public List<User> getUsers();
    
    public User getUser(User user);
    
    public User getUser(@Param(value="userName") String userName);
    
    public int addUser(User user);
}
