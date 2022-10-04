package chap09.sec01.exam06;

/**
 * packageName : chap09.sec01.exam06
 * fileName : ButtonApplication
 * author : ds
 * date : 2022-10-04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class ButtonApplication {
    public static void main(String[] args) {
        Button button = new Button();

//        다형성.
        button.setOnClickListener(new CallListener());
        button.touch();  // CallListener의 재정의된 onClick() 함수가 실행

        button.setOnClickListener(new MessageListener());
        button.touch();  // MessageListener의  재정의된 onClick() 함수가 실행


    }
}
