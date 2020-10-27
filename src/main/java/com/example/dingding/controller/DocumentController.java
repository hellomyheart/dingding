package com.example.dingding.controller;

import com.example.dingding.annotation.DocumentLog;
import com.example.dingding.mapper.DocumentMapper;
import com.example.dingding.service.DocumentService;
import com.example.dingding.vo.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    /**
     * 上传文档
     *
     * @param file
     * @return
     * @throws IOException
     */
    @PostMapping("add")
    public ResponseResult add(@RequestParam("file") MultipartFile file) throws IOException {
        return documentService.add(file);
    }

    /**
     * 修改文档
     *
     * @param file
     * @return
     * @throws IOException
     */
    @DocumentLog(module = "文档服务",type = "add", operation = "修改文档")
    @PostMapping("update")
    public ResponseResult update(@RequestParam("file") MultipartFile file,String filename) throws IOException {
        return documentService.update(file, filename);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @GetMapping("delete/{id}")
    public ResponseResult delete(@PathVariable("id") Integer id){
        boolean b = documentService.removeById(id);
        if (b){
            return ResponseResult.ok();
        }
        return ResponseResult.fail();
    }


}
