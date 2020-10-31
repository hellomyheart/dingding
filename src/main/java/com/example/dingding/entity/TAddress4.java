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
    * 详细地址表
    */
@ApiModel(value="com-example-dingding-entity-TAddress4")
@Data
@TableName(value = "t_address4")
public class TAddress4 implements BaseEntity {
    @TableId(value = "id", type = IdType.AUTO)
    @ApiModelProperty(value="")
    private Integer id;

    /**
     * 区名
     */
    @TableField(value = "name")
    @ApiModelProperty(value="区名")
    private String name;

    /**
     * 状态（0.删除1.正常）
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态（0.删除1.正常）")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_STATUS = "status";
}
