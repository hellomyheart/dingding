package com.example.dingding.dto;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

/**
 * projectName: dingding
 * author: 张宁
 * time: 2020/10/25 16:23
 * description:
 */
@Data
public class GroupLogDto {
    @TableField("u_id")
    private Integer uId;
    @TableField("o_type")
    private String oType;
    @TableField("status")
    private String status;
}
