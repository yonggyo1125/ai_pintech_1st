package org.koreait.question;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Slf4j
@Controller
@RequestMapping("/question")
@SessionAttributes({"requestQuestion", "testField"})   // requestQuestion 이름인 값은 session 범위에서 관리
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
    public String save(RequestQuestion form, SessionStatus status) {  // 양식 작업 완료!

        log.info("step:{} / {}", 3, form.toString());

        status.setComplete(); // 더이상 Model을 통한 값 추가를 방지! - 처리 완료 시점에 적용

        return "question/step3";
    }

    @ResponseBody
    @GetMapping("/test1")
    public void test1(@SessionAttribute("requestQuestion") RequestQuestion form) {
        log.info("test: {} / {}", 1, form.toString());
    }

    @ResponseBody
    @GetMapping("/test2")
    public void test2(Model model) {
        model.addAttribute("testField", "테스트 값2....");
    }
    /*
    public void test2(HttpSession session) {
        session.setAttribute("testField", "테스트 값...");
    } */

    @ResponseBody
    @GetMapping("/test3")
    public void test3(@SessionAttribute("testField") String value) {
        log.info("testField:" + value);
    }

    public void test4(HttpServletRequest request) {
        //ServletContext application = request.getServletContext();
    }
}
