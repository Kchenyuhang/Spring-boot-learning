package com.soft1851.springboot.mbp.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/16
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class UserVo {
    private String userName;
    private String roleName;
    private String description;
    private String pName;
}
