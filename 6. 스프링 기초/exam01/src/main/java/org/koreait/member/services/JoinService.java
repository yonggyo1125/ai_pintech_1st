package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.validators.AdvancedJoinValidator;
import org.koreait.member.validators.JoinValidator;

/**
 * 회원가입 기능
 */
public class JoinService {

    private final Validator<RequestJoin> validator;
    private final MemberRepository repository;

    /**
     * 의존 관계
     * JoinService 객체를 생성하는데 validator가 필수!
     *
     * @param validator
     */
    public JoinService(Validator<RequestJoin> validator, MemberRepository repository) {
        this.validator = validator;
        this.repository = repository;
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

        // form, joinService에 서로 영향을 주고 받는 관계 - 변화에 영향을 받는다 -
        // 통제가 필요! - 메서드 안에 감출필요! 캡슐화! / 변화에 닫힌 구조!
        validator.check(form);


    }
}
