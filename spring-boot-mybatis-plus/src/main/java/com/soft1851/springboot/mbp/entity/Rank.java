package com.soft1851.springboot.mbp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @Author yhChen
 * @Description
 * @Date 2020/4/16
 */
@Data
public class Rank {
    @TableId(value = "id",type = IdType.INPUT)
    private Integer id;
    private String title;
    private Integer play;
    private Integer barrage;
    private String pic;
    private String url;
    private String collect;
    private Integer follow;
    private Integer score;
}
