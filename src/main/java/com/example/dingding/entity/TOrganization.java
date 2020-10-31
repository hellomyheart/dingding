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
    * 组织表
    */
@ApiModel(value="com-example-dingding-entity-TOrganization")
@Data
@TableName(value = "t_organization")
public class TOrganization implements BaseEntity {
    /**
     * 组织id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="组织id")
    private Integer id;

    /**
     * 创建者id

     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="创建者id,")
    private Integer uId;

    /**
     * 组织名
     */
    @TableField(value = "o_name")
    @ApiModelProperty(value="组织名")
    private String oName;

    /**
     * 组织地址
     */
    @TableField(value = "o_address")
    @ApiModelProperty(value="组织地址")
    private String oAddress;

    /**
     * 组织描述
     */
    @TableField(value = "o_description")
    @ApiModelProperty(value="组织描述")
    private String oDescription;

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

    /**
     * 状态：0删除，1正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态：0删除，1正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_O_NAME = "o_name";

    public static final String COL_O_ADDRESS = "o_address";

    public static final String COL_O_DESCRIPTION = "o_description";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}
