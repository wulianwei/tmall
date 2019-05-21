/*
 * 文件名：RoleService.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月8日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import com.tmall.entity.Role;
import com.tmall.mapper.RoleMapper;

public class RoleService
{
    @Autowired
    private RoleMapper roleMapper;
    
    public Set<String> listRoleName(String userName)
    {
        Set<String> set = new HashSet<String>();
        List<Role> roles = roleMapper.listRoleByUserName(userName);
        for(Role role:roles)
        {
            set.add(role.getRoleName());
        }
        return set;
    }

}
