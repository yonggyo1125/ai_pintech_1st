package org.koreait.board.services;

import org.koreait.board.entities.Board;

import java.util.ArrayList;
import java.util.List;

public class BoardInfoService {

    public List<Board> getList() {
        ArrayList<Board> items = new ArrayList<>();
        for (long i = 1; i <= 10L; i++) {
            Board item = new Board();
            item.setSeq(i);
            item.setPoster("작성자" + i);
            item.setSubject("제목" + i);
            item.setContent("내용" + i);

            items.add(item);
        }

        return items;
    }
}
