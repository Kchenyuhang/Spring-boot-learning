package com.soft1851.springboot.aop.service.impl;

import com.soft1851.springboot.aop.entity.SysUser;
import com.soft1851.springboot.aop.mapper.SysUserMapper;
import com.soft1851.springboot.aop.mapper.UserRoleMapper;
import com.soft1851.springboot.aop.service.SysUserService;
import com.soft1851.springboot.aop.util.Md5Util;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/14
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper mapper;
    @Resource
    private UserRoleMapper userRoleMapper;

    @Override
    public Map<String, Object> signIn(String id, String password) {
        SysUser user = mapper.signIn(id);
        Map<String, Object> userMap = new HashMap<>();
        String pass = Md5Util.getMD5(password, 32);
        if (user != null && user.getPassword().equals(pass)) {
            userMap = userRoleMapper.getUserRole(id);
            if (userMap != null) {
                return userMap;
            }
        }
        userMap.put("msg", "账号密码错误");
        return userMap;
    }
}
