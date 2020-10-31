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
    * 文档表
    */
@ApiModel(value="com-example-dingding-entity-TDocument")
@Data
@TableName(value = "t_document")
public class TDocument implements BaseEntity {
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
     * 文档名
     */
    @TableField(value = "d_name")
    @ApiModelProperty(value="文档名")
    private String dName;

    /**
     * 文档地址
     */
    @TableField(value = "d_address")
    @ApiModelProperty(value="文档地址")
    private String dAddress;

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
     * 状态：0,文件删除，1.仅自己可见，2所有人可见
     */
    @TableField(value = "status")
    @ApiModelProperty(value="状态：0,文件删除，1.仅自己可见，2所有人可见")
    private Integer status;

    private static final long serialVersionUID = 1L;

    public static final String COL_ID = "id";

    public static final String COL_U_ID = "u_id";

    public static final String COL_D_NAME = "d_name";

    public static final String COL_D_ADDRESS = "d_address";

    public static final String COL_CREATETIME = "createtime";

    public static final String COL_UPDATETIME = "updatetime";

    public static final String COL_STATUS = "status";
}
