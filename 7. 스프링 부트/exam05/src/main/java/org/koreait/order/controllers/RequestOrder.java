package org.koreait.order.controllers;

import lombok.Data;

import java.time.LocalDate;

@Data
public class RequestOrder {
    private LocalDate sDate;
    private LocalDate eDate;
}
