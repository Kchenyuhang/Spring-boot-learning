package com.soft1851.springboot.mbp.controller;


import com.soft1851.springboot.mbp.entity.UserVo;
import com.soft1851.springboot.mbp.mapper.UserRoleMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yhChen
 * @since 2020-04-16
 */
@RestController
@RequestMapping("/userRole")
public class UserRoleController {
    @Resource
    private UserRoleMapper userRoleMapper;

    @GetMapping("/id")
    public List<UserVo> getUserPermission(String userId) {
        return userRoleMapper.getUserPermission(userId);
    }
}
