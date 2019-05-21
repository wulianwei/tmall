/*
 * 文件名：URLPathMatchingFilter.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月4日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.filter;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.apache.shiro.web.util.WebUtils;

import com.tmall.service.PermissionService;
import com.tmall.util.SpringContextUtils;

/**
 * 
 * 判断用户是否有当前请求权限 
 * @author wulianwei
 * @version 2019年4月8日
 * @see URLPathMatchingFilter
 * @since
 */
public class URLPathMatchingFilter extends PathMatchingFilter
{
    PermissionService permissionService;
    
    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception
    {
        if(null==permissionService) 
            permissionService = SpringContextUtils.getContext().getBean(PermissionService.class);
        String requestURI = getPathWithinApplication(request);
        Subject subject = SecurityUtils.getSubject();
     // 如果没有登录，就跳转到登录页面
        if (!subject.isAuthenticated()) {
            WebUtils.issueRedirect(request, response, "/login");
            return false;
        }
        boolean needInterceptor = permissionService.needInterceptor(requestURI);
        if (!needInterceptor) {
            return true;
        }
        else
        {
            boolean hasPermission = false;
            String userName = subject.getPrincipal().toString();
            Set<String> permissionUrls = permissionService.listPermissionPath(userName);
            for (String url : permissionUrls) {
                // 这就表示当前用户有这个权限
                if (url.equals(requestURI)) {
                    hasPermission = true;
                    break;
                }
            }
            if (hasPermission)
                return true;
            else {
                UnauthorizedException ex = new UnauthorizedException("当前用户没有访问路径 " + requestURI + " 的权限");

                subject.getSession().setAttribute("ex", ex);

                WebUtils.issueRedirect(request, response, "/unauthorized");
                return false;
            }
        }
        
    }
    
    

}
