package kr.co.sunnyvale.datajpaexam.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "board")
@Setter
@Getter
public class Board {
    @Id // 엔티티는 id 가 있어야 한다. (식별자.)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 사용자가 입력하는 값이 아니라 자동 생성.
    private Long id;
    private String name;
    private String title;

    @Basic(fetch = FetchType.LAZY)
    @Lob
    private String content;
    private int readCount;
    private Date regdate;

    @Override
    public String toString() {
        return "Board{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", readCount=" + readCount +
                ", regdate=" + regdate +
                '}';
    }
}
