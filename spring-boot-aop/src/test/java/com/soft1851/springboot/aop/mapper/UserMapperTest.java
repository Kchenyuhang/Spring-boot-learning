package com.soft1851.springboot.aop.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/13
 */
@SpringBootTest
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void selectAll() {
        System.out.println(userMapper.selectAll());
    }
}