package chap08.sec01;

/**
 * packageName : chap08
 * fileName : RemoteCotrolApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class RemoteControlApplication {
    public static void main(String[] args) {

//        다형성 티비 객체
        RemoteControl rc = new Tv();
        rc.turnOn();
        rc.setVolumn(5);
        rc.turnOff();

//        다형성 오디오 객체
        rc = new Audio();
        rc.turnOn();
        rc.setVolumn(3);
        rc.turnOff();
    }
}
