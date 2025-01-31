package org.koreait.member.services;

import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;

public class JoinService2 {
    private Validator<RequestJoin> validator;

    public JoinService2(Validator<RequestJoin> validator) {
        this.validator = validator;
    }

    public void process() {

    }
}
