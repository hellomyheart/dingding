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
    * 部门日志
    */
@ApiModel(value="com-example-dingding-entity-DepartmentLog")
@Data
@TableName(value = "department_log")
public class DepartmentLog implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 用户id
     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="用户id")
    private Integer uId;

    /**
     * 日志类型
     */
    @TableField(value = "log_type")
    @ApiModelProperty(value="日志类型")
    private String logType;

    /**
     * 操作描述
     */
    @TableField(value = "operation")
    @ApiModelProperty(value="操作描述")
    private String operation;

    /**
     * 创建时间
     */
    @TableField(value = "createtime")
    @ApiModelProperty(value="创建时间")
    private Date createtime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_LOG_TYPE = "log_type";

    public static final String COL_OPERATION = "operation";

    public static final String COL_CREATETIME = "createtime";
}
