/*
 * 文件名：App.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年3月11日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.DispatcherServlet;

@SpringBootApplication
@EnableAutoConfiguration
@EnableTransactionManagement(proxyTargetClass = true)
@MapperScan("com.tmall.mapper")
public class App
{
    public static void main(String[] args)
    {
        SpringApplication.run(App.class, args);
    }
    
    /**
     * 设置匹配.action后缀的请求
     * @param dispatcherServlet
     * @return
     */
   /* @Bean
    public ServletRegistrationBean servletRegistrationBean(DispatcherServlet dispatcherServlet) {
        ServletRegistrationBean bean = new ServletRegistrationBean(dispatcherServlet);
        bean.addUrlMappings("*.action");
        return bean;
    }*/

}
