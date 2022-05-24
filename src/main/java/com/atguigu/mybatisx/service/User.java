package com.atguigu.mybatisx.service;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName t_user
 */
@TableName(value ="t_user")//实体类对应表名名t_user
public class User implements Serializable {
    //id 为字段名, 类型为自动递增(非雪花算法)
    @TableId(value = "id", type = IdType.AUTO)
    private Long uid;
    @TableField("name")//name为字段名
    private String userName;
    @TableField("age")//age为字段名
    private Integer age;
    @TableLogic//逻辑删除
    private Integer isDeleted;
    @TableField(exist = false)//表示不存在数据库中
    private static final long serialVersionUID = 1L;
}