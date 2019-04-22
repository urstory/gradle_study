package kr.co.sunnyvale.datajpaexam.repository;

import kr.co.sunnyvale.datajpaexam.domain.Board;
import kr.co.sunnyvale.datajpaexam.repository.custom.BoardRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long>, BoardRepositoryCustom {
}
