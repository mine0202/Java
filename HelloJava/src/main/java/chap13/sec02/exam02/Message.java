package chap13.sec02.exam02;

/**
 * packageName : chap13.sec02.exam02
 * fileName : Message
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
// Queue (큐 ) : 인터페이스 , FIFO ( First In First Out ) 먼저들어간 것이 먼저 나옴
//      구현클래스 ( LinkedList 사용 )
//      Queue 함수들
//    .offer(객체)  : 주어진 객체를 큐에 넣는 함수
//    .peek()  : 맨 앞에 있는 객체의 정보를 조회하는 함수, 객체를 삭제하지 않음
//    .poll()  : 맨 앞에 있는 객체를 꺼냄, 큐에서 그 객체 삭제함
public class Message {
    public String command;
    public String to;

    public Message(String command, String to) {
        this.command = command;
        this.to = to;
    }

//    public 으로 만들어서 getter, setter 만들지 않음.
}
