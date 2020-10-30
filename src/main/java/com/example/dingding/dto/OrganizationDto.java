package com.example.dingding.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/30 20:16
 * description:
 */
@Data
public class OrganizationDto {
    @TableField(value = "o_name")
    @ApiModelProperty(value="组织名")
    private String oName;

    @TableField(value = "o_address")
    @ApiModelProperty(value="组织地址")
    private String oAddress;

    @TableField(value = "o_description")
    @ApiModelProperty(value="组织描述")
    private String oDescription;
}
