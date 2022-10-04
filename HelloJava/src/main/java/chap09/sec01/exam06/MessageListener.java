package chap09.sec01.exam06;

/**
 * packageName : chap09.sec01.exam06
 * fileName : MessageListener
 * author : ds
 * date : 2022-10-04
 * description : Button 안의 공유 중첩 인터페이스 구현 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class MessageListener implements Button.OnClickListener{
    @Override
    public void onClick() {
        System.out.println("메세지를 보냅니다.");
    }
}
