package com.soft1851.springboot.aop.service;

import java.util.List;
import java.util.Map;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/14
 */
public interface RolePermissionService {
    /**
     * 查询超管权限
     *
     * @return
     */
    List<Map<String, Object>> getAdminRolePermission();

    /**
     *
     * @param sysAdminId
     * @return
     */
    List<Map<String, Object>> getRolePermissionBySysAdmin(int sysAdminId);
}
