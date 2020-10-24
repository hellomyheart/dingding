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
 * time: 2020/10/22 14:42
 * description:组织表
 */
@Data
@TableName("organization")
@NoArgsConstructor
public class Organization {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private Integer uid;
    private String oname;
    private String oaddress;
    private String odescription;
    private Date createtime;
    private Date updatetime;

    public Organization(Integer uid, String oname, String oaddress, String odescription, Date createtime, Date updatetime) {
        this.uid = uid;
        this.oname = oname;
        this.oaddress = oaddress;
        this.odescription = odescription;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }
}
