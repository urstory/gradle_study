package kr.co.sunnyvale.datajpaexam.repository;

import kr.co.sunnyvale.datajpaexam.domain.Board;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BoardRepositoryTest {
    @Autowired
    BoardRepository boardRepository;

    @Test
    public void getBoard(){
        // given
        Board saveBoard = new Board();
        saveBoard.setContent("hello content");
        saveBoard.setName("kim");
        saveBoard.setReadCount(0);
        saveBoard.setRegdate(new Date());
        saveBoard.setTitle("hello title");
        saveBoard = boardRepository.save(saveBoard);

        // when
        Board board = boardRepository.findById(saveBoard.getId()).get();

        // then
        assertThat(board.getId()).isNotNull();
    }

    @Test
    public void getBoardById(){
        // given
        Board saveBoard = new Board();
        saveBoard.setContent("hello content");
        saveBoard.setName("kim");
        saveBoard.setReadCount(0);
        saveBoard.setRegdate(new Date());
        saveBoard.setTitle("hello title");
        saveBoard = boardRepository.save(saveBoard);

        // when
        Board board = boardRepository.getBoardById(saveBoard.getId());

        // then
        assertThat(board.getId()).isNotNull();
    }
}
