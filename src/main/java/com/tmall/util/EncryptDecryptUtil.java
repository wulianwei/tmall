/*
 * 文件名：EncryptDecryptUtil.java
 * 版权：Copyright by www.thit.com
 * 描述：
 * 修改人：wulianwei
 * 修改时间：2019年4月3日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.tmall.util;

import java.security.MessageDigest;

public class EncryptDecryptUtil
{
    private static final String hexDigIts[] = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};
    
    /**
     * 
     * Description: md5加密
     * @param text
     * @return 
     * @see
     */
    public static String md5(String text)
    {
        String result="";
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            result=byteArrayToHexString(md.digest(text.getBytes("UTF-8")));
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    
    public static String byteArrayToHexString(byte b[]){
        StringBuffer resultSb = new StringBuffer();
        for(int i = 0; i < b.length; i++){
            resultSb.append(byteToHexString(b[i]));
        }
        return resultSb.toString();
    }

    public static String byteToHexString(byte b){
        int n = b;
        if(n < 0){
            n += 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigIts[d1] + hexDigIts[d2];
    }

}
