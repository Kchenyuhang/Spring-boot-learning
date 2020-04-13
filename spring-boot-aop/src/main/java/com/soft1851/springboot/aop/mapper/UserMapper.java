package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/13
 */
public interface UserMapper {
    /**
     * 查询所有用户信息
     * @return
     */
    @Select("SELECT * FROM t_user ")
    List<User> selectAll();
}
