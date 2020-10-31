package com.example.dingding.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * projectName: dingding
 * author: CGY
 * time: 2020/10/30 20:16
 * description:
 */
@Data
public class OrganizationDto implements Serializable {

    private static final long serialVersionUID = 8929482090994672097L;
    private String oName;

    private String oAddress;

    private String oDescription;
}
