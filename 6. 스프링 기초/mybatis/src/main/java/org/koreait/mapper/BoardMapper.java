package org.koreait.mapper;

import org.apache.ibatis.annotations.Select;
import org.koreait.board.entities.Board;

import java.util.List;

public interface BoardMapper {

    @Select("SELECT * FROM BOARD_DATA")
    List<Board> getList();
}
