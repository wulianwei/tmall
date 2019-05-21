/*
 * 文件名：SpringContextUtils.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月8日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class SpringContextUtils
{
    private static ApplicationContext context;  
    
    public void setApplicationContext(ApplicationContext context)  
            throws BeansException {  
        SpringContextUtils.context = context;  
    }  
  
    public static ApplicationContext getContext(){  
        return context;  
    } 

}
