package com.example.dingding.service;

import com.example.dingding.entity.Document;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface DocumentService extends IService<Document>{


    ResponseResult add(MultipartFile multipartFile) throws IOException;

    ResponseResult update(MultipartFile file,String filename) throws IOException;
}
