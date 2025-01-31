package org.koreait.member.services;

import org.junit.jupiter.api.Test;
import org.koreait.global.validators.Validator;
import org.koreait.member.controllers.RequestJoin;
import org.koreait.member.validators.AdvancedJoinValidator;
import org.koreait.member.validators.JoinValidator;

public class JoinServiceTest {
    @Test
    void test1() {
       Validator<RequestJoin> validator = new AdvancedJoinValidator();
        JoinService joinService = new JoinService(validator);
    }

    @Test
    void test2() {
        JoinService2 joinService2 = new JoinService2(new JoinValidator());
    }

    @Test
    void test3() {
        ServiceContainer container = new ServiceContainer();

        JoinService joinService = container.joinService();
        JoinService2 joinService2 = container.joinService2();
    }
}
