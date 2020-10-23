package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/22 20:37
 * description:
 */
@Data
@TableName("group_user")
@NoArgsConstructor
public class GroupUser {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("g_id")
    private Integer gId;
    @TableField("u_id")
    private Integer uId;
    @TableField("createtime")
    private Date createTime;
    @TableField("status")
    private String status;


    public GroupUser(Integer id, Integer gId, Integer uId, Date createTime, String status) {
        this.id = id;
        this.gId = gId;
        this.uId = uId;
        this.createTime = createTime;
        this.status = status;
    }
}
