package chap14.sec02.exam06;

import java.io.Serializable;
import java.util.Date;
// Model(순수객체) :  속성 , 생성자 , setter , getter, 그 외에 로직을 구하는 함수는 없음
// 목적 : 데이터 저장용 / 검색용
// Service 업무가 들어가 있는 클래스 (객체 )
// Controller : 여러 화면(View)을 조작하는 (컨트롤하는) 클래스
// MVC 디자인 패턴 ( 종합편 ): Model , View , Controller
public class Board implements Serializable {
//    속성
//    게시판 번호
    private int bno;
//    제목
    private String title;
//    내용
    private String content;
//    작성자
    private String writer;
//    날짜
    private Date date;

//    생성자
    public Board(int bno, String title, String content, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

//    getter / setter : 속성은 외부에서 숨기고 , 외부로 함수를 통해서 실행할 수 있게함
    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
