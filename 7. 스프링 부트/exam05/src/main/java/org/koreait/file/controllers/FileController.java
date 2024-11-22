package org.koreait.file.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Slf4j
@Controller
@RequestMapping("/file")
public class FileController {

    @GetMapping("/upload")
    public String upload() {
        return "file/upload";
    }

    @ResponseBody
    @PostMapping("/upload")
    public void uploadPs(@RequestPart("file") MultipartFile _file) {
        log.info(_file.toString());
    }
}
