package com.example.dingding.dto;

import lombok.Data;

import java.util.Date;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/23 16:12
 * description:
 */
@Data
public class GroupUserDto {
    private Integer uId;
    private Integer gId;
    private Date createTime;
}
