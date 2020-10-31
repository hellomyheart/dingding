package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.dingding.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 用户表
    */
@ApiModel(value="com-example-dingding-entity-TUser")
@Data
@TableName(value = "t_user")
public class TUser implements BaseEntity {
    /**
     * userId
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="userId")
    private Integer id;

    /**
     * 手机号
     */
    @TableField(value = "phone")
    @ApiModelProperty(value="手机号")
    private String phone;

    /**
     * 邮箱
     */
    @TableField(value = "email")
    @ApiModelProperty(value="邮箱")
    private String email;

    /**
     * 密码（密文）
     */
    @TableField(value = "password")
    @ApiModelProperty(value="密码（密文）")
    private String password;

    /**
     * 昵称
     */
    @TableField(value = "nickname")
    @ApiModelProperty(value="昵称")
    private String nickname;

    /**
     * 标志位 0 未激活，1激活
     */
    @TableField(value = "status")
    @ApiModelProperty(value="标志位 0 未激活，1激活")
    private Integer status;

    /**
     * 头像地址
     */
    @TableField(value = "icon")
    @ApiModelProperty(value="头像地址")
    private String icon;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @ApiModelProperty(value="创建时间")
    private Date createtime;

    /**
     * 修改时间
     */
    @TableField(value = "updatetime")
    @ApiModelProperty(value="修改时间")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_PHONE = "phone";

    public static final String COL_EMAIL = "email";

    public static final String COL_PASSWORD = "password";

    public static final String COL_NICKNAME = "nickname";

    public static final String COL_STATUS = "status";

    public static final String COL_ICON = "icon";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";
}
