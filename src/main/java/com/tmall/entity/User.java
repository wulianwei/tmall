/*
 * 文件名：User.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年3月8日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.entity;

public class User
{

    private String id;
    private String userName;
    private String userLoginname;
    private String userPassword;
    private String userPhone;
    private String createTime;
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getUserName()
    {
        return userName;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public String getUserLoginname()
    {
        return userLoginname;
    }
    public void setUserLoginname(String userLoginname)
    {
        this.userLoginname = userLoginname;
    }
    public String getUserPassword()
    {
        return userPassword;
    }
    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }
    public String getUserPhone()
    {
        return userPhone;
    }
    public void setUserPhone(String userPhone)
    {
        this.userPhone = userPhone;
    }
    public String getCreateTime()
    {
        return createTime;
    }
    public void setCreateTime(String createTime)
    {
        this.createTime = createTime;
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((createTime == null) ? 0 : createTime.hashCode());
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((userLoginname == null) ? 0 : userLoginname.hashCode());
        result = prime * result + ((userName == null) ? 0 : userName.hashCode());
        result = prime * result + ((userPassword == null) ? 0 : userPassword.hashCode());
        result = prime * result + ((userPhone == null) ? 0 : userPhone.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        User other = (User)obj;
        if (createTime == null)
        {
            if (other.createTime != null) return false;
        }
        else if (!createTime.equals(other.createTime)) return false;
        if (id == null)
        {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        if (userLoginname == null)
        {
            if (other.userLoginname != null) return false;
        }
        else if (!userLoginname.equals(other.userLoginname)) return false;
        if (userName == null)
        {
            if (other.userName != null) return false;
        }
        else if (!userName.equals(other.userName)) return false;
        if (userPassword == null)
        {
            if (other.userPassword != null) return false;
        }
        else if (!userPassword.equals(other.userPassword)) return false;
        if (userPhone == null)
        {
            if (other.userPhone != null) return false;
        }
        else if (!userPhone.equals(other.userPhone)) return false;
        return true;
    }
   
    
}
