package org.koreait.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.koreait.board.entities.Board;

import java.util.List;

public interface BoardMapper {

    @Select("SELECT * FROM BOARD_DATA")
    List<Board> getList();

    @Select("SELECT * FROM BOARD_DATA WHERE SUBJECT LIKE #{skey1} AND CONTENT LIKE #{skey2}")
    List<Board> getList2(@Param("skey1") String skey1, @Param("skey2") String skey2);

    @Select("SELECT * FROM BOARD_DATA WHERE seq=#{seq}")
    Board get(long seq);

    List<Board> getList3(Board board);

    int register(Board board);

    long total();
}
