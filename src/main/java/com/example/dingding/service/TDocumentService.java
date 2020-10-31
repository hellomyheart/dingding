package com.example.dingding.service;

import com.example.dingding.commons.pagehelper.PageHelperParam;
import com.example.dingding.entity.TDocument;
import com.example.dingding.commons.service.BaseService;
import com.example.dingding.vo.ResponseResult;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface TDocumentService extends BaseService<TDocument>{


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

    PageInfo<TDocument> selectAll();
}
