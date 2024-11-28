package org.koreait.jpaex;

import com.github.javafaker.Faker;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.koreait.member.constants.Authority;
import org.koreait.member.entities.Address;
import org.koreait.member.entities.Member;
import org.koreait.member.repositories.AddressRepository;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Locale;

@SpringBootTest
@ActiveProfiles({"default", "test"})
public class Ex07 {
    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private MemberRepository memberRepository;

    @PersistenceContext
    private EntityManager em;

    @BeforeEach
    void init() {
        Faker faker = new Faker(Locale.KOREA);
        Address address = new Address();
        address.setAddress(faker.address().streetAddress());
        address.setAddressSub(faker.address().secondaryAddress());
        addressRepository.saveAndFlush(address);

        Member member = new Member();
        member.setEmail(faker.internet().emailAddress());
        member.setName(faker.name().fullName());
        member.setPassword("12345678");
        member.setAuthority(Authority.USER);

        member.setAddress(address);

        memberRepository.saveAndFlush(member);

        em.clear();
    }

    @Test
    void test1() {
        Member member = memberRepository.findById(1L).orElse(null);

        Address address = member.getAddress();

        System.out.println(member);
        System.out.println(address);
    }

    @Test
    void test2() {
        Address address = addressRepository.findById(1L).orElse(null);
        Member member = address.getMember();

        System.out.println(address);
        System.out.println(member);
    }
}
