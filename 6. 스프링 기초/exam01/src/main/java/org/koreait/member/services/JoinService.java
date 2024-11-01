package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.validators.JoinValidator;

/**
 * 회원가입 기능
 */
public class JoinService {

    private Validator<RequestJoin> joinValidator = new JoinValidator();

    /**
     * 가입 처리
     *
     * RequestJoin - DTO(Data Transfer Object) : 사용자가 입력한 값을 전달
     */
    public void process(RequestJoin form) {

    }
}
