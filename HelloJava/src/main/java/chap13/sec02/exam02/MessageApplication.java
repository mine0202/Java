package chap13.sec02.exam02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * packageName : chap13.sec02.exam02
 * fileName : MessageApplication
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class MessageApplication {
    public static void main(String[] args) {
//        Queue 객체 생성 , 다형성
//        부모인터페이스 변수 = new 자식클래스();
        Queue<Message> messageQueue = new LinkedList<>();

//        Queue 자료 저장
//        new Message (명령어 , 대상 )
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "이상해"));
        messageQueue.offer(new Message("sendKakaotalk", "홍삼"));

//      Queue  실행 출력
//        .isEmpty()  있으면 false, 없으면 true
        while (!messageQueue.isEmpty()){
//            자료한개 꺼내기
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to+"님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to+ "님에게 SMS를 보냅니다.");
                    break;
                case  "sendKakaotalk":
                    System.out.println(message.to+ "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
