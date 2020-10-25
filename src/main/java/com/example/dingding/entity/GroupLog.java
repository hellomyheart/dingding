package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/24 21:19
 * description:
 */
@Data
@TableName("group_log")
public class GroupLog {
    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Integer id;
    @TableField("createtime")
    private Date createTime;
    @TableField("o_type")
    private String oType;
    @TableField("status")
    private String status;

    public GroupLog(Date createTime, String oType, String status) {
        this.createTime = createTime;
        this.oType = oType;
        this.status = status;
    }
}
