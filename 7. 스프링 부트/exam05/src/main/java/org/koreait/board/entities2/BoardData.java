package org.koreait.board.entities2;

import jakarta.persistence.*;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;
import org.koreait.member.entities.Member;

import java.util.List;

@Data
@Entity
public class BoardData extends BaseEntity {
    @Id @GeneratedValue
    private Long seq; // 게시글 번호

    @Column(nullable = false)
    private String subject;

    @Lob
    @Column(nullable = false)
    private String content;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="bid") // 외래키 이름을 직접 지정
    private Board board;

    @ManyToOne(fetch=FetchType.LAZY)
    private Member member;

    @ManyToMany
    private List<HashTag> tags;
}
