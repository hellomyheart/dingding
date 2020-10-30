package com.example.dingding.service;

import com.example.dingding.entity.TDocument;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface TDocumentService extends IService<TDocument>{


    ResponseResult save(MultipartFile file) throws IOException;
}
