/*
 * 文件名：Hello.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年3月1日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * 首页功能 
 * @author wulianwei
 * @version 2019年3月29日
 * @see Hello
 * @since
 */
@Controller
public class Hello
{

    /**
     * 
     * Description: 首页
     * @return 
     * @see
     */
    @RequestMapping("/")
    public String sayHello()
    {
        return "index";
    }

    /**
     * 
     * Description: 直接访问WEB-INF中的页面
     * @param path
     * @return 
     * @see
     */
    @GetMapping("/redirect/{path}")
    public String redirct(@PathVariable String path)
    {
        return path;
    }
}
