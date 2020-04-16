package com.soft1851.springboot.mbp.mapper;

import com.soft1851.springboot.mbp.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.soft1851.springboot.mbp.entity.UserVo;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yhChen
 * @since 2020-04-16
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {

    /**
     * 查询指定id的用户的所有权限的功能
     * @param userId
     * @return List<UserVo>
     */
    List<UserVo> getUserPermission(String userId);

}
