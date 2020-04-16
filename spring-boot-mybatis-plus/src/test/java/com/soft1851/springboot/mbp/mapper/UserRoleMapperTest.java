package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.SpringBootMybatisPlusApplication;
import com.soft1851.springboot.mbp.entity.UserVo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/16
 */
@SpringBootTest(classes = SpringBootMybatisPlusApplication.class)
class UserRoleMapperTest {

    @Resource
    private UserRoleMapper userRoleMapper;

    @Test
    void getUserPermission() {
        List<UserVo> userVos = userRoleMapper.getUserPermission("1");
        userVos.forEach(System.out::println);
    }
}