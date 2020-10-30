package com.example.dingding.controller;

import com.example.dingding.service.TDocumentService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @description 文档控制器
 * @className: DocumentController
 * @package: com.example.dingding.controller
 * @author: Stephen Shen
 * @date: 2020/10/30 上午10:00
 */
@RestController
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    TDocumentService tDocumentService;

    /**
     * 上传文档
     * @param file
     * @return
     */
    @PostMapping("add")
    public ResponseResult add(@RequestParam("file") MultipartFile file) throws IOException {
        return tDocumentService.save(file);
    }


}
