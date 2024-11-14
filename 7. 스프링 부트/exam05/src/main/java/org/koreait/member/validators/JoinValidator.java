package org.koreait.member.validators;

import org.koreait.member.controllers.RequestJoin;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class JoinValidator implements Validator {
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

    }
}
