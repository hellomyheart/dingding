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
 * time: 2020/10/22 20:17
 * description:
 */
@Data
@TableName("group")
@NoArgsConstructor
public class Group {
    @TableId(type = IdType.AUTO)
    private Integer id;
    @TableField("u_id")
    private Integer uId;
    @TableField("g_name")
    private String gName;
    @TableField("createtime")
    private Date createTime;
    @TableField("updatetime")
    private Date updateTime;

    public Group(Integer id, Integer uId, String gName, Date createTime, Date updateTime) {
        this.id = id;
        this.uId = uId;
        this.gName = gName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Group(Integer uId, String gName, Date createTime, Date updateTime) {
        this.uId = uId;
        this.gName = gName;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }
}
