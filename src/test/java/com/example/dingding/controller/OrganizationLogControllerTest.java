package com.example.dingding.controller;

import com.example.dingding.dto.OrganizationLogDto;
import com.example.dingding.mapper.OrganizationLogMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrganizationLogControllerTest {

    @Test
    void all() {
        OrganizationLogDto dto = new OrganizationLogDto();
        dto.setOname("组织部");
        dto.setOtype("加入组织");
        dto.setStatus("1");
        System.out.println("dto = " + dto);

    }
}