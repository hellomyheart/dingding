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

    private String oName;

    private String oAddress;

    private String oDescription;
}
