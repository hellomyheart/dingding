package com.example.dingding.controller;

import com.example.dingding.mapper.DocumentMapper;
import com.example.dingding.service.DocumentService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @description
 * @className: DocumentController
 * @package: com.example.dingding.controller
 * @author: Stephen Shen
 * @date: 2020/10/22 下午8:09
 */
@RestController
@RequestMapping("/document/")
public class DocumentController {

    @Autowired
    DocumentService documentService;

    @PostMapping("add")
    public ResponseResult add(@RequestParam("file") MultipartFile file) throws IOException {
        return documentService.add(file);
    }


}
