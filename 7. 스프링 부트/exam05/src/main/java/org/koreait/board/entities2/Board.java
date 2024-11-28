package org.koreait.board.entities2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import org.koreait.global.entities.BaseEntity;

import java.util.List;

@Data
@Entity
public class Board extends BaseEntity {
    @Id  // 게시판 아이디
    private String bid;

    @Column(length=50, nullable = false)
    private String bname; // 게시판명

    @OneToMany(mappedBy = "board") // 관계 주인 BoardData의 외래키 참조인 board
    private List<BoardData> items;
}
