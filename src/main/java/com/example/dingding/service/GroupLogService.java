package com.example.dingding.service;

import com.example.dingding.dto.GroupLogDto;
import com.example.dingding.entity.GroupLog;
import com.example.dingding.vo.ResponseResult;

public interface GroupLogService {

   ResponseResult all(Integer uId);
}
