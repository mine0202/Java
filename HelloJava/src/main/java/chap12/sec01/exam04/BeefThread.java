package chap12.sec01.exam04;

import java.awt.*;

/**
 * packageName : chap12.sec01.exam04
 * fileName : BeefThread
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
//Thread 클래스 상속받아 만들기
public class BeefThread extends Thread{
    @Override
    public void run() {
//        멀티미디어 객체
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try{
                Thread.sleep(500);  // 0.5 초 지연
            }catch (Exception e){

            }
        }
    }
}
