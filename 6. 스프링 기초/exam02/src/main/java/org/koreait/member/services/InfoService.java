package org.koreait.member.services;

import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;

import java.util.List;

public class InfoService {

    private MemberRepository repository;

    public void setRepository(MemberRepository repository) {
        this.repository = repository;
    }

    public void print() {
        List<Member> members = repository.getList();
        members.forEach(System.out::println);
    }
}
