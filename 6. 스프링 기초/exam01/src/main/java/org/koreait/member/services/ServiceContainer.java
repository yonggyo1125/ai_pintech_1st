package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.repositories.MemberRepository;
import org.koreait.member.validators.AdvancedJoinValidator;

public class ServiceContainer {

    public Validator<RequestJoin> joinValidator() {
        //return new JoinValidator();
        return new AdvancedJoinValidator();
    }

    public MemberRepository memberRepository() {
        return new MemberRepository();
    }


    public JoinService joinService() {
        return new JoinService(joinValidator(), memberRepository());
    }

    public JoinService2 joinService2() {
        return new JoinService2(joinValidator());
    }
}
