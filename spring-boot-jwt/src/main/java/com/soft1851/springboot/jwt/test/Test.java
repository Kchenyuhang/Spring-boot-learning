package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.interfaces.DecodedJWT;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/15
 */
public class Test {
    public static void main(String[] args) {
        // 生成token
        Encrypt encrypt = new Encrypt();
        String token = encrypt.getToken(true, "soft1851", "软件1851","111");

        // 打印token
        System.out.println("token: " + token);

        // 解密token
        Decrypt decrypt = new Decrypt();
        DecodedJWT jwt = decrypt.deToken(token);

        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("isVip:  " + jwt.getClaim("isVip").asBoolean());
        System.out.println("username: " + jwt.getClaim("username").asString());
        System.out.println("name:     " + jwt.getClaim("name").asString());
        System.out.println("password:    " + jwt.getClaim("password").asString());
        System.out.println("过期时间：      " + jwt.getExpiresAt());

        long nowTime=System.currentTimeMillis();
        long time = jwt.getExpiresAt().getTime();
        System.out.println("token未失效");
        while (nowTime<= time){
            nowTime=System.currentTimeMillis();
        }
        System.out.println("token已失效");

    }
}
