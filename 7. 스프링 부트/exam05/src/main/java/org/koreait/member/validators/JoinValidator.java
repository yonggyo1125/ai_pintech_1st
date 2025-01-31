package org.koreait.member.validators;

import org.koreait.global.validators.MobileValidator;
import org.koreait.member.controllers.RequestJoin;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator, MobileValidator {
    /**
     * 검증을 할 커맨드 객체를 한정
     *  RequestJoin 커맨드 객체만을 검증할거야!
     */
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(RequestJoin.class);
    }

    /**
     * 커맨드 객체 검증 수행
     *
     * Object target : 검증할 커맨드 객체
     * Errors errors
     *  - 검증 실패시 전달할 메세지를 설정
     */
    @Override
    public void validate(Object target, Errors errors) {

        RequestJoin form = (RequestJoin)target;

        /**
         * 필수 항목 검증 S
         * email, password, confirmPassword, name, agree
         */

        String email = form.getEmail();
        String password = form.getPassword();
        String confirmPassword = form.getConfirmPassword();
        String name = form.getName();
        boolean agree = form.isAgree();
        /*
        if (email == null || email.isBlank()) {
            errors.rejectValue("email", "Required", "이메일을 입력하세요.");
        }

        if (password == null || password.isBlank()) {
            errors.rejectValue("password", "Required", "비밀번호를 입력하세요.");
        }

        if (confirmPassword == null || confirmPassword.isBlank()) {
            errors.rejectValue("confirmPassword", "Required", "비밀번호를 확인하세요.");
        }

        if (name == null || name.isBlank()) {
            errors.rejectValue("name", "Required", "회원명을 입력하세요.");
        }

        if (!agree) { // 약관에 동의하지 않은 경우!
            errors.rejectValue("agree", "Agree", "회원가입 약관에 동의해 주세요!");
        } */
        /*
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required", "이메일을 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required", "비밀번호를 입력하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "Required", "비밀번호를 확인하세요.");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Required", "회원명을 입력하세요.");
        */
        /*
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "confirmPassword", "Required");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "Required");

        if (!agree) { // 약관에 동의하지 않은 경우!
            errors.rejectValue("agree", "Agree");
        } */
        /* 필수항목 검증 E */


        /* 비밀번호, 비밀번호 확인 일치 여부 체크 */
        if (password != null && confirmPassword != null
                && !password.equals(confirmPassword)) {
            errors.rejectValue("confirmPassword", "Mismatch");
        }

        /* 휴대전화번호 형식 체크 */
        String mobile = form.getMobile();
        if (mobile != null && !mobile.isBlank() && !checkMobile(mobile)) {
            errors.rejectValue("mobile", "Mobile");
        }

        /*
        boolean result = false;
        if (!result) {
            errors.reject("Fail.join"); // 특정 필드가 아닌 일반적인 검증 실패
        } */
    }
}
