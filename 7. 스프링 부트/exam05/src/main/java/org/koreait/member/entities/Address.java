package org.koreait.member.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id @GeneratedValue
    private Long seq;

    private String zipcode;
    private String address;
    private String addressSub;
}
