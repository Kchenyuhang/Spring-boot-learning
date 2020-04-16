package com.soft1851.springboot.mbp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Date;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/16
 */
@Data
public class Student {
    @TableId(value = "student_id",type = IdType.INPUT)
    private Integer studentId;
    private Integer clazzId;
    private String studentName;
    private String hometown;
    private Date birthday;
}
