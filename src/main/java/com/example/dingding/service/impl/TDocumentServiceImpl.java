package com.example.dingding.service.impl;

import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.dingding.entity.TDocument;
import com.example.dingding.mapper.TDocumentMapper;
import com.example.dingding.service.TDocumentService;
import org.springframework.web.multipart.MultipartFile;

@Service
public class TDocumentServiceImpl extends ServiceImpl<TDocumentMapper, TDocument> implements TDocumentService {

    @Autowired
    private TDocumentMapper tDocumentMapper;

    @Override
    public ResponseResult save(MultipartFile file) {
        if (!file.isEmpty()) {
            String fillname = rename(file.getOriginalFilename());


        }
        return ResponseResult.fail();
    }


    private String rename(String filename) {
        if (filename.length() > 20) {
            filename = filename.substring(filename.length() - 20);
        }
        return UUID.randomUUID().toString().replaceAll("-", "") + filename;
    }

}
