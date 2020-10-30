package com.example.dingding.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * projectName: dingding
 *
 * @author: xr
 * time: 2020/10/30 20:13
 * description:打卡计划
 */
@Data
public class SignPlanDto {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 群id(部门群)
     */
    @TableField(value = "g_id")
    @ApiModelProperty(value="群id(部门群)")
    private Integer gId;

    /**
     * 用户id(创建者)
     */
    @TableField(value = "u_id")
    @ApiModelProperty(value="用户id(创建者)")
    private Integer uId;

    /**
     * 打卡计划名
     */
    @TableField(value = "sp_name")
    @ApiModelProperty(value="打卡计划名")
    private String spName;

    /**
     * 打开卡开始时间
     */
    @TableField(value = "start_time")
    @ApiModelProperty(value="打开卡开始时间")
    private Date startTime;

    /**
     * 结束时间
     */
    @TableField(value = "end_time")
    @ApiModelProperty(value="结束时间")
    private Date endTime;

    /**
     * 打卡开始日期
     */
    @TableField(value = "start_date")
    @ApiModelProperty(value="打卡开始日期")
    private Date startDate;

    /**
     * 打卡结束日期
     */
    @TableField(value = "end_date")
    @ApiModelProperty(value="打卡结束日期")
    private Date endDate;

    @TableField(value = "createtime")
    @ApiModelProperty(value="")
    private Date createtime;

    @TableField(value = "updatetime")
    @ApiModelProperty(value="")
    private Date updatetime;

    /**
     * 状态：0删除，1正常
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态：0删除，1正常")
    private Integer status;


}
