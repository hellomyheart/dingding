package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @description
 * @className: User
 * @package: com.example.dingding.entity
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:33
 */
@Data
@TableName("user")
@NoArgsConstructor
public class User implements Serializable {
    @TableId(type = IdType.AUTO)
    private  Integer id;
    private  String phone;
    private String email;
    private  String password;
    private String nickname;
    private  Integer status;
    private String icon;
    private Date createtime;
    private Date upadatetime;

}
