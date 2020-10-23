package com.example.dingding.dto;

import lombok.Data;
import sun.security.util.Password;

import java.io.Serializable;

/**
 * @description
 * @className: UserDto
 * @package: com.example.dingding.dto
 * @author: Stephen Shen
 * @date: 2020/10/21 上午8:33
 */
@Data
public class UserDto implements Serializable {
    private String phone;
    private String name;
    private String password;
    private static final long serialVersionUID = 1040871397516296025L;
}
