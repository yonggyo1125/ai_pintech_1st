package org.koreait.board.repositories;

import org.koreait.board.entities2.BoardData;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface BoardDataRepository extends JpaRepository<BoardData, Long>, QuerydslPredicateExecutor<BoardData> {

    // 즉시 로딩 @EntityGraph 즉시 로딩할 속성 명시
    @EntityGraph(attributePaths = {"board", "member"})
    List<BoardData> findBySubjectContaining(String key);

    @Query("SELECT b1 FROM BoardData b1 LEFT JOIN FETCH b1.board")
    List<BoardData> getItems();
}
