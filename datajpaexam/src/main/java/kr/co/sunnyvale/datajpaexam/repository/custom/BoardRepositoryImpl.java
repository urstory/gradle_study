package kr.co.sunnyvale.datajpaexam.repository.custom;

import com.querydsl.jpa.JPQLQuery;
import kr.co.sunnyvale.datajpaexam.domain.Board;
import kr.co.sunnyvale.datajpaexam.domain.QBoard;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class BoardRepositoryImpl extends QuerydslRepositorySupport implements BoardRepositoryCustom {
    public BoardRepositoryImpl(){
        super(Board.class); // 사용할 Entity클래스를 지정.
    }

    @Override
    public Board getBoardById(Long id) {
        QBoard qBoard = QBoard.board;
        JPQLQuery<Board> jpqlQuery = from(qBoard).where(qBoard.id.eq(id));
        return jpqlQuery.fetchOne();
    }
}
