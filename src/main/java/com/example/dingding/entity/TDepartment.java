package com.example.dingding.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.example.dingding.commons.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/**
    * 部门表
    */
@ApiModel(value="com-example-dingding-entity-TDepartment")
@Data
@TableName(value = "t_department")
public class TDepartment implements BaseEntity {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 组织id
     */
    @TableField(value = "o_id")
    @ApiModelProperty(value="组织id")
    private Integer oId;

    /**
     * 上级部门id
     */
    @TableField(value = "f_id")
    @ApiModelProperty(value="上级部门id")
    private Integer fId;

    /**
     * 部门名
     */
    @TableField(value = "d_name")
    @ApiModelProperty(value="部门名")
    private String dName;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_O_ID = "o_id";

    public static final String COL_F_ID = "f_id";

    public static final String COL_D_NAME = "d_name";
}
