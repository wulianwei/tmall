/*
 * 文件名：UserController.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年3月8日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tmall.entity.Result;
import com.tmall.entity.User;
import com.tmall.service.UserService;

/**
 * 
 * 用户相关功能
 * @author wulianwei
 * @version 2019年3月29日
 * @see UserController
 * @since
 */
@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    UserService userService;
    
    /**
     * 
     * Description: 获取所有用户
     * 
     * @return 
     * @see
     */
    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<User> getAllUser()
    {
        return userService.getAllUsers();
    }
    
    /**
     * 
     * Description: 注册用户
     * @param user
     * @return 
     * @see
     */
    @PostMapping("/addUser")
    @ResponseBody
    public Result addUser(User user)
    {
        return userService.addUser(user);
    }
    
    /**
     * 
     * Description: 注册用户
     * @param user
     * @return 
     * @see
     */
    @PostMapping("/login")
    @ResponseBody
    public void login(User user)
    {
        User user2 = userService.getUser(user);
    }
}
