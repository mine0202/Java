package chap12.sec01.exam01;

import java.awt.*;

/**
 * packageName : chap12.sec01.exam01
 * fileName : BeepTask
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class BeepTask implements Runnable {
//    작업쓰레드 실행함수
    public void run(){
//        beep 를 들려주는 코드
//        자바쪽 멀티미디어 객체 : 소리, 그림 , 이미지 등등 다루는 객체
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep(); // 비프음 컴퓨터 삐소리
            try{
                Thread.sleep(500); // 0.5초 지연 그후 삐 소리
            }catch (Exception e){

            }
        }

    }
}
