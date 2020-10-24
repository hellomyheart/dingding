package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/24 19:49
 * description:组织操作日志表
 */
@Data
@TableName("OrganizationLog ")
@NoArgsConstructor
public class OrganizationLog {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Date createtime;
    private String oname;
    private String otype;
    private String status;

    public OrganizationLog(Date createtime, String oname, String otype, String status) {
        this.createtime = createtime;
        this.oname = oname;
        this.otype = otype;
        this.status = status;
    }
}
