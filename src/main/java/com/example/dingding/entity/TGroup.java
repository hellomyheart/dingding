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
    * 群
    */
@ApiModel(value="com-example-dingding-entity-TGroup")
@Data
@TableName(value = "t_group")
public class TGroup implements BaseEntity {
    /**
     * 组id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="组id")
    private Integer id;

    /**
     * 用户id
     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="用户id")
    private Integer uId;

    /**
     * 组名
     */
    @TableField(value = "g_name")
    @ApiModelProperty(value="组名")
    private String gName;

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
     * 状态： 0删除，1正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态： 0删除，1正常")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_G_NAME = "g_name";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}
