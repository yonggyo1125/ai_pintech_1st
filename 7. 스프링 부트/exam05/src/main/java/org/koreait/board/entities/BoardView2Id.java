package org.koreait.board.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
@AllArgsConstructor
public class BoardView2Id {

    @Column(name="_UID")
    private int uid;
    private long seq;
}
