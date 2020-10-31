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
    * 区表
    */
@ApiModel(value="com-example-dingding-entity-TAddress3")
@Data
@TableName(value = "t_address3")
public class TAddress3 implements BaseEntity {
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
     * 市id
     */
    @TableField(value = "p_id")
    @ApiModelProperty(value="市id")
    private Integer pId;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_NAME = "name";

    public static final String COL_P_ID = "p_id";
}
