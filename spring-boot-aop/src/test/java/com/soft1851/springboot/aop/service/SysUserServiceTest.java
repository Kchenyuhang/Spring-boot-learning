package com.soft1851.springboot.aop.service;

import com.soft1851.springboot.aop.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/14
 */
@SpringBootTest
class SysUserServiceTest {
    @Resource
    private SysUserService sysUserService;

    @Test
    void signIn() {
        System.out.println(sysUserService.signIn("2","222"));
    }
}