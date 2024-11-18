package org.koreait.question;

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
}
