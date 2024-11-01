package org.koreait.member.services;

import org.koreait.member.validators.JoinValidator;

public class ServiceContainer {

    public JoinValidator joinValidator() {
        return new JoinValidator();
    }

    public JoinService joinService() {
        return new JoinService(joinValidator());
    }

    public JoinService2 joinService2() {
        return new JoinService2(joinValidator());
    }
}
