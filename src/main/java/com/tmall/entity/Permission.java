/*
 * 文件名：Permission.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月4日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.entity;

/**
 * 
 * 权限
 * @author wulianwei
 * @version 2019年4月4日
 * @see Permission
 * @since
 */
public class Permission
{

    private String id;//ID
    private String permName;//权限名称
    private String permPath;//权限路径
    private String permMark;//权限描述
    public String getId()
    {
        return id;
    }
    public void setId(String id)
    {
        this.id = id;
    }
    public String getPermName()
    {
        return permName;
    }
    public void setPermName(String permName)
    {
        this.permName = permName;
    }
    public String getPermPath()
    {
        return permPath;
    }
    public void setPermPath(String permPath)
    {
        this.permPath = permPath;
    }
    public String getPermMark()
    {
        return permMark;
    }
    public void setPermMark(String permMark)
    {
        this.permMark = permMark;
    }
    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((permMark == null) ? 0 : permMark.hashCode());
        result = prime * result + ((permName == null) ? 0 : permName.hashCode());
        result = prime * result + ((permPath == null) ? 0 : permPath.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Permission other = (Permission)obj;
        if (id == null)
        {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        if (permMark == null)
        {
            if (other.permMark != null) return false;
        }
        else if (!permMark.equals(other.permMark)) return false;
        if (permName == null)
        {
            if (other.permName != null) return false;
        }
        else if (!permName.equals(other.permName)) return false;
        if (permPath == null)
        {
            if (other.permPath != null) return false;
        }
        else if (!permPath.equals(other.permPath)) return false;
        return true;
    }
    
}
