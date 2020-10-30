package com.example.dingding.dto;

import lombok.Data;

/**
 * projectName:dingding
 * ourther:范崇博
 * time：2020/10/3021:16
 * description:
 */
@Data
public class UserUpdateDto {
    private String phone;
    private  String email;
    private  String nickname;
    private  String icon;
}
