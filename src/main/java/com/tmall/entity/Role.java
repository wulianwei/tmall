/*
 * 文件名：Role.java
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
 * 角色
 * @author wulianwei
 * @version 2019年4月4日
 * @see Role
 * @since
 */
public class Role
{
    private String id; //ID
    
    private String roleName; //角色名称
    
    private String roleMark; //角色描述

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getRoleName()
    {
        return roleName;
    }

    public void setRoleName(String roleName)
    {
        this.roleName = roleName;
    }

    public String getRoleMark()
    {
        return roleMark;
    }

    public void setRoleMark(String roleMark)
    {
        this.roleMark = roleMark;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((roleMark == null) ? 0 : roleMark.hashCode());
        result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Role other = (Role)obj;
        if (id == null)
        {
            if (other.id != null) return false;
        }
        else if (!id.equals(other.id)) return false;
        if (roleMark == null)
        {
            if (other.roleMark != null) return false;
        }
        else if (!roleMark.equals(other.roleMark)) return false;
        if (roleName == null)
        {
            if (other.roleName != null) return false;
        }
        else if (!roleName.equals(other.roleName)) return false;
        return true;
    }
    
}
