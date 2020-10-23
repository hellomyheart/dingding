package com.example.dingding.dto;

import lombok.Data;

import java.util.Date;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/23 16:08
 * description:
 */
@Data
public class GroupDto {
    private Integer uId;
    private String gName;
    private Date createTime;
}
