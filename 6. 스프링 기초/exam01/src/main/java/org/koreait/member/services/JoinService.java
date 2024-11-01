package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.validators.AdvancedJoinValidator;
import org.koreait.member.validators.JoinValidator;

/**
 * 회원가입 기능
 */
public class JoinService {
    // 구성
    private Validator<RequestJoin> joinValidator;


    /**
     * 의존 관계
     *
     * @param joinValidator
     * - JoinService 객체 생성을 위해서는 joinValidator가 필수!
     */
    public JoinService(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }

    /**
     * 연관 관계
     * JoinService 객체를 생성할떄 필수는 아니기때문
     * @param joinValidator
     */
    /*
    public void setValidator(Validator<RequestJoin> joinValidator) {
        this.joinValidator = joinValidator;
    }
    */
    /**
     * 가입 처리
     *
     * RequestJoin - DTO(Data Transfer Object) : 사용자가 입력한 값을 전달
     */
    public void process(RequestJoin form) {

    }
}
