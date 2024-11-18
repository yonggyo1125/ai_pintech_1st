package org.koreait.question;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequestMapping("/question")
@SessionAttributes("requestQuestion")   // requestQuestion 이름인 값은 session 범위에서 관리
public class QuestionController {

    @ModelAttribute("requestQuestion")
    public RequestQuestion requestQuestion() {
        return new RequestQuestion();
    }

    @GetMapping("/step1")
    public String step1() {

        return "question/step1";
    }

    @PostMapping("/step2")
    public String step2(RequestQuestion form) {
        log.info("step:{} / {}", 1, form.toString());
        return "question/step2";
    }

    @PostMapping("/step3")
    public String step3(RequestQuestion form) {
        log.info("step:{} / {}", 2, form.toString());

        return "question/step3";
    }

    @PostMapping("/save")
    public String save(RequestQuestion form) {

        log.info("step:{} / {}", 3, form.toString());

        return "question/step3";
    }

    @ResponseBody
    @GetMapping("/test1")
    public void test1(@SessionAttribute("requestQuestion") RequestQuestion form) {
        log.info("test: {} / {}", 1, form.toString());
    }

    @ResponseBody
    @GetMapping("/test2")
    public void test2(HttpSession session) {
        session.setAttribute("testField", "테스트 값...");
    }

    @ResponseBody
    @GetMapping("/test3")
    public void test3(@SessionAttribute("testField") String value) {
        log.info("testField:" + value);
    }
}
