package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.validators.AdvancedJoinValidator;
import org.koreait.member.validators.JoinValidator;

/**
 * 회원가입 기능
 */
public class JoinService {

    private Validator<RequestJoin> validator;

    /**
     * 의존 관계
     * JoinService 객체를 생성하는데 validator가 필수!
     *
     * @param validator
     */
    public JoinService(Validator<RequestJoin> validator) {
        this.validator = validator;
    }

    /**
     * 연관 관계
     * JoinSevice 객체를 생성하는데 필수는 아니다, 연관성이 있다.
     * @param validator
     */
    /*
    public void setValidator(Validator<RequestJoin> validator) {
        this.validator = validator;
    }
    */
    public void process(RequestJoin form) {
        validator.check(form);
    }
}
