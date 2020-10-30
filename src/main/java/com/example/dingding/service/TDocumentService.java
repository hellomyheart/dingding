package com.example.dingding.service;

import com.example.dingding.entity.TDocument;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface TDocumentService extends IService<TDocument>{


    /**
     * 上传文档
     * @param file
     * @return
     * @throws IOException
     */
    ResponseResult save(MultipartFile file) throws IOException;

    /**
     * 修改文档
     * @param file
     * @param fileId
     * @return
     */
    ResponseResult update(MultipartFile file, Integer fileId) throws IOException;
}
