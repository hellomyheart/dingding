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
    * 打卡表
    */
@ApiModel(value="com-example-dingding-entity-Sign")
@Data
@TableName(value = "sign")
public class Sign implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 打卡计划id
     */
    @TableField(value = "sp_id")
    @ApiModelProperty(value="打卡计划id")
    private Integer spId;

    /**
     * 打卡人id
     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="打卡人id")
    private Integer uId;

    /**
     * 打卡时间
     */
    @TableField(value = "sign_time")
    @ApiModelProperty(value="打卡时间")
    private Date signTime;

    /**
     * 状态（0是删除，1是正常）
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态（0是删除，1是正常）")
    private String status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_SP_ID = "sp_id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_SIGN_TIME = "sign_time";

    public static final String COL_STATUS = "status";
}