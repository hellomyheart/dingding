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
    * 部门管理员表
    */
@ApiModel(value="com-example-dingding-entity-DepartmentAdmin")
@Data
@TableName(value = "department_admin")
public class DepartmentAdmin implements BaseEntity {
    /**
     * id

     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id,")
    private Integer id;

    /**
     * 部门id
     */
    @TableField(value = "d_id")
    @ApiModelProperty(value="部门id")
    private Integer dId;

    /**
     * 用户id
     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="用户id")
    private Integer uId;

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
     * 状态 :0，离开部门，1加入部门
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态 :0，离开部门，1加入部门")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_D_ID = "d_id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}
