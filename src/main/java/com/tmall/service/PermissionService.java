/*
 * 文件名：PermissionService.java
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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmall.entity.Permission;
import com.tmall.mapper.PermissionMapper;

@Service
public class PermissionService
{
    @Autowired
    private PermissionMapper permissionMapper;
    
    public List<Permission> listPermission(Permission permission)
    {
        return permissionMapper.listPermission(permission);
    }
    
    
    public Permission getPermission(Permission permission){
        return permissionMapper.getPermission(permission);
    }
    
    public Set<String> listPermissionPath(String userName)
    {
        Set<String> set = new HashSet<String>();
        List<Permission> perms = permissionMapper.listPermissionByUserName(userName);
        for(Permission p:perms)
        {
            set.add(p.getPermPath());
        }
        return set;
    }
    public boolean needInterceptor(String requestURI) {
        List<Permission> ps = listPermission(null);
        for (Permission p : ps) {
            if (p.getPermPath().equals(requestURI))
                return true;
        }
        return false;
    }
}
