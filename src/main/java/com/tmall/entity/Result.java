/*
 * 文件名：Result.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.entity;

public class Result
{
    private String status="";//状态
    
    private String message="";//提示
        
    private Object resultData;//数据对象
    
    private static final Result SUCCESS=new Result("true","success");
        
    public Result(String status, String message)
    {
        super();
        this.status = status;
        this.message = message;
    }
    

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    public Object getResultData()
    {
        return resultData;
    }

    public void setResultData(Object resultData)
    {
        this.resultData = resultData;
    }
    
    public static Result success()
    {
        return SUCCESS;
    }
    
}
