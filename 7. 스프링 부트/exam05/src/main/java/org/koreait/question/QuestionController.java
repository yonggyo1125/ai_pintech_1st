package org.koreait.question;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/question")
public class QuestionController {
    @GetMapping("/step1")
    public String step1(@ModelAttribute RequestQuestion form) {

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
