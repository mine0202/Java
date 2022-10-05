package chap11.sec02.exam02;

/**
 * packageName : chap11.sec02.exam01
 * fileName : Board
 * author : ds
 * date : 2022-10-05
 * description : board 객체를 저장하는 Vector
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
//  Vector : 멀티쓰레드 환경 ( 프로그래밍 ) 사용하는 자료구조 , ArrayList 거의 유사
//          동기화맞추기: Vector 동기화가 구현되어 있음.synchronized
public class Board {
    String subject;

    String content;

    String writer;

//    생성자 : 속성의 초기값 지정하는 부분
    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;

    }
}
