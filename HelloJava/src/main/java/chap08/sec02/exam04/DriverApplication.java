package chap08.sec02.exam04;

/**
 * packageName : chap08.sec02.exam04
 * fileName : DriverApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 문제 :
//    결과 :
//          박쥐가 날고있습니다.
//          참새가 날고 있습니다.
//          고래가 수영하고 있습니다.
public class DriverApplication {
    public static void main(String[] args) {
        Flyable flyable = new Bat();
        flyable.fly();

        flyable = new Sparrow();
        flyable.fly();

        Swimable swimable = new Whale();
        swimable.swim();

    }
}
