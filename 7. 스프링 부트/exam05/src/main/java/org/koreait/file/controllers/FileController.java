package org.koreait.file.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

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
    public void uploadPs(@RequestPart("file") MultipartFile _file, @RequestPart("file2") MultipartFile file2) {
        //log.info(_file.toString());
        log.info("getName(): {}", _file.getName());  // <input .. name='이름'
        log.info("getOriginalFilename(): {}", _file.getOriginalFilename()); // 업로드한 파일 이름
        log.info("getSize(): {}", _file.getSize()); // 파일 용량(바이트)

        // 업로드할 경로!
        File uploadPath = new File("D:/uploads/" + _file.getOriginalFilename());
        try {
            _file.transferTo(uploadPath); // 임시 저장공간에 있는 파일 -> 지정한 서버 경로 이동
        } catch (IOException e) {}

        log.info("file2 : {}", file2.getOriginalFilename());
    }

    @PostMapping("/upload2")
    public void uploadPs2(@RequestPart("file") MultipartFile[] files) {
        for (MultipartFile file : files) {
            try {
                file.transferTo(new File("D:/uploads/" + file.getOriginalFilename()));
            } catch (IOException e) {}
        }
    }
}
