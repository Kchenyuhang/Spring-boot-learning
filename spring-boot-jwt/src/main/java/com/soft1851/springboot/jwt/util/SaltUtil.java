package com.soft1851.springboot.jwt.util;

import java.io.UnsupportedEncodingException;
import java.util.UUID;

/**
 * @Author yhChen
 * @Description 生成盐
 * @Date 2020/4/15
 */
public class SaltUtil {
    /**
     * 生成32位的随机盐值
     */
    public static String createSalt(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        String mySecret = SaltUtil.createSalt();
        System.out.println("当前密钥为："+ mySecret);
    }
}
