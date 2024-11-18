package org.koreait.question;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/question")
public class QuestionController {
    @GetMapping("/step1")
    public String step1() {

        return "question/step1";
    }

    @PostMapping("/step2")
    public String step2() {

        return "question/step2";
    }

    @PostMapping("/step3")
    public String step3() {

        return "question/step3";
    }
}
