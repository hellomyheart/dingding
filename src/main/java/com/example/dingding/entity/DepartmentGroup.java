package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
    * 部门群表
    */
@ApiModel(value="com-example-dingding-entity-DepartmentGroup")
@Data
@TableName(value = "department_group")
public class DepartmentGroup implements Serializable {
    /**
     * 部门群表
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="部门群表")
    private Integer id;

    /**
     * 部门id
     */
    @TableField(value = "d_id")
    @ApiModelProperty(value="部门id")
    private Integer dId;

    /**
     * 部门群名
     */
    @TableField(value = "d_name")
    @ApiModelProperty(value="部门群名")
    private String dName;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @ApiModelProperty(value="创建时间")
    private Date createtime;

    /**
     * 更新时间
     */
    @TableField(value = "updatetime")
    @ApiModelProperty(value="更新时间")
    private Date updatetime;

    /**
     * 状态：0删除1.正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态：0删除1.正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_D_ID = "d_id";

    public static final String COL_D_NAME = "d_name";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}