package org.koreait.member.controllers;

import lombok.Data;

@Data
public class RequestAddress {
    private String zipcode;
    private String address;
    private String addressSub;
}
