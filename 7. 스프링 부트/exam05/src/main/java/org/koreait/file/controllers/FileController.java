package org.koreait.file.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/file")
public class FileController {

    @GetMapping("/upload")
    public String upload() {
        return "file/upload";
    }

    @ResponseBody
    @PostMapping("/upload")
    public void uploadPs() {

    }
}
