/*
 * 文件名：PermissionMapper.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月4日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tmall.entity.Permission;

public interface PermissionMapper
{
    public List<Permission> listPermission(Permission permission);
    
    public List<Permission> listPermissionByUserName(@Param(value="userName") String userName);
    
    public Permission getPermission(Permission permission);

}
