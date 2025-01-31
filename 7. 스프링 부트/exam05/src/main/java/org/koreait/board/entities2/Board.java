package org.koreait.board.entities2;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.koreait.global.entities.BaseEntity;

import java.util.List;

@Data
@Entity
public class Board extends BaseEntity {
    @Id  // 게시판 아이디
    private String bid;

    @Column(length=50, nullable = false)
    private String bname; // 게시판명

    @ToString.Exclude // ToString 메서드에서 배제
    @OneToMany(mappedBy = "board", cascade = {CascadeType.REMOVE, CascadeType.PERSIST}, orphanRemoval = true) // 관계 주인 BoardData의 외래키 참조인 board
    private List<BoardData> items;
}
