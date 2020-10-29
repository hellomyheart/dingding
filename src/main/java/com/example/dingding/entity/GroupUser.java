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
    * 群_用户中间表（群成员表）
    */
@ApiModel(value="com-example-dingding-entity-GroupUser")
@Data
@TableName(value = "group_user")
public class GroupUser implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 群id
     */
    @TableField(value = "g_id")
    @ApiModelProperty(value="群id")
    private Integer gId;

    /**
     * 用户id
     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="用户id")
    private Integer uId;

    /**
     * 入群时间

     */
    @TableField(value = "createtime")
    @ApiModelProperty(value="入群时间,")
    private Date createtime;

    /**
     * 状态(0申请，-1未通过，1正常，2退出群)
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态(0申请，-1未通过，1正常，2退出群)")
    private Integer status;

    @TableField(value = "updatetime")
    @ApiModelProperty(value="")
    private Date updatetime;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_G_ID = "g_id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_STATUS = "status";

    public static final String COL_UPDATETIME = "updatetime";
}