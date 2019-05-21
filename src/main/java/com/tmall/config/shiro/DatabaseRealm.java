/*
 * 文件名：DatabaseRealm.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月8日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.config.shiro;

import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.tmall.entity.User;
import com.tmall.service.PermissionService;
import com.tmall.service.RoleService;
import com.tmall.service.UserService;

public class DatabaseRealm extends AuthorizingRealm
{

    @Autowired
    private UserService userService;
    
    @Autowired
    private RoleService roleService;
    
    @Autowired
    private PermissionService permissionService;
    
    /**
     * 鉴权
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection)
    {
        // TODO Auto-generated method stub
        String userName = (String)principalCollection.getPrimaryPrincipal();
        Set<String> permissions = permissionService.listPermissionPath(userName);
        Set<String> roles = roleService.listRoleName(userName);
        SimpleAuthorizationInfo s = new SimpleAuthorizationInfo();
        s.setRoles(roles);
        s.setStringPermissions(permissions);
        return s;
    }

    /**
     * 认证
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
        throws AuthenticationException
    {
        // TODO Auto-generated method stub
        UsernamePasswordToken t = (UsernamePasswordToken)token;
        String userName = t.getUsername();
        String password = new String(t.getPassword());
        User user = userService.getUser(userName);
        String passwordInDB = user.getUserPassword();
        if(null !=passwordInDB && !passwordInDB.equals(password))
        {
            throw new AuthenticationException();
        }
        SimpleAuthenticationInfo a = new SimpleAuthenticationInfo(userName,password,getName());
        return a;
    }

}
