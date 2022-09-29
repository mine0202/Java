package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam06
 * fileName : Car
 * author : ds
 * date : 2022-09-29
 * description : final 함수, 부모클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Car {
    public int speed;

    public void  speedUp(){
        speed ++;
    }

//    final 함수
    public final void stop(){
        System.out.println("차를 멈춤");
        speed = 0;
    }
}
