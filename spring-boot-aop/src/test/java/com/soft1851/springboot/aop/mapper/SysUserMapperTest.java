package com.soft1851.springboot.aop.mapper;

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
class SysUserMapperTest {
    @Resource
    private SysUserMapper mapper;

    @Test
    void getUserById() {
        System.out.println(mapper.getUserById("1"));
    }

    @Test
    void signIn() {
    }
}