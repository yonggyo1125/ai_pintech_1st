package org.koreait.member.controllers;

import lombok.Data;

import java.util.List;

@Data
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    //private String[] hobby;
    private List<String> hobby;
}
