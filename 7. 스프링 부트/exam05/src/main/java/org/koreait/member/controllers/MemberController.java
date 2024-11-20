package org.koreait.member.controllers;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.koreait.member.services.LoginService;
import org.koreait.member.validators.JoinValidator;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {

    private final JoinValidator joinValidator;
    private final LoginService loginService;
    private final MessageSource messageSource;

    /**
     * 회원가입 양식
     *
     * @return
     */
    /*
    @GetMapping("/join")
    public String join(Model model) {

        RequestJoin requestJoin = new RequestJoin();
        model.addAttribute("requestJoin", requestJoin);

        return "member/joinForm";
    }
    */
    @ModelAttribute("apples")
    public List<String> apples() {
        return List.of("사과1", "사과2", "사과3");
    }

    @GetMapping("/join")
    public String join(@ModelAttribute RequestJoin form, Model model) { // RequestJoin - requestJoin

        return "member/joinForm";
    }

    /**
     * 회원 가입 처리!
     * @Valid : 검증할 커맨드 객체임을 알려준다!
     * @Valid이 있으면 반드시 Errors 객체는 커맨드 객체 바로 다음에 나와야 한다!
     * @return
     */
    @PostMapping("/join")
    public String joinPs(@Valid RequestJoin form, Errors errors) {

        joinValidator.validate(form, errors); // 커맨드 객체 검증

        if (errors.hasErrors()) { // 검증 실패! - reject, rejectValue가 한번이라도 호출 되었다!
            return "member/joinForm"; // 검증 실패하면 사용자에게 양식을 다시 보여주고, 검증 실패 정보를 제공!
        }

        // 검증 성공시 - 가입 처리 서비스 호출

       return "redirect:/member/login"; // 가입 성공시 로그인 페이지로 이동
    }

    @GetMapping("/login")
    public String login(@ModelAttribute RequestLogin form, @CookieValue(name="savedEmail", required = false) String savedEmail) {
        /*
        if (true) {
            throw new AlertRedirectException("테스트 예외", "/member/join", HttpStatus.BAD_REQUEST);
        }
        */
        if (savedEmail != null) { // 쿠키값이 있다면
            form.setEmail(savedEmail);
            form.setSaveEmail(true);
        }

        return "member/login";
    }

    @PostMapping("/login")
    public String loginPs(@Valid RequestLogin form, Errors errors) {

        if (errors.hasErrors()) {
            return "member/login";
        }

        // 검증에 이상이 없는 상태 -> 로그인 처리

        loginService.process(form);

        return "redirect:/";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate(); // 세션 비우기

        return "redirect:/member/login";
    }

    /**
     * MemberController 공통 검증
     * @Valid가 붙어 있는 커맨드 객체 공통 검증 처리
     *
     * @param binder
     */
    /*
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setValidator(joinValidator);
    } */

    //@ExceptionHandler({MemberNotFoundException.class, IllegalArgumentException.class})
    /*
    @ExceptionHandler(Exception.class)
    public ModelAndView errorHandler(Exception e, Model model, HttpServletRequest request) {
        e.printStackTrace();

        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR; // 기본 응답 코드 500
        String message = e.getMessage(); // 기본 메세지

        if (e instanceof CommonException commonException) { // 직접 정의한 예외인 경우 정의한 예외로 대체
            status = commonException.getStatus();
            if (commonException.isErrorCode()) {
                message = messageSource.getMessage(message, null, request.getLocale());
            }
        }

        //response.setStatus(status.value());

        ModelAndView mv = new ModelAndView();
        mv.setStatus(status);
        mv.addObject("message", message);
        mv.setViewName("error/errorPage");

        return mv;
    }
    */
}
