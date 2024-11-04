package org.koreait.member.services;

import org.koreait.member.entities.Member;
import org.koreait.member.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class InfoService {

    private MemberRepository repository;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd");

    @Autowired
    public void setRepository(@Qualifier("mRepo") MemberRepository repository) {
        this.repository = repository;
    }

    //@Autowired(required = false)
    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        this.formatter = formatter;
    }

    public void print() {
        List<Member> members = repository.getList();
        members.forEach(m -> {
            if (formatter != null) {
                String regDtStr = formatter.format(m.getRegDt());
                m.setRegDtStr(regDtStr);
            }

            System.out.println(m);
        });
    }
}
