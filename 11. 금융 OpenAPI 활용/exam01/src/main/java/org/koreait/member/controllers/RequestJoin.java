package org.koreait.member.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor @AllArgsConstructor
public class RequestJoin {
    private String email;
    private String password;
    private String confirmPassword;
    private String name;
}
