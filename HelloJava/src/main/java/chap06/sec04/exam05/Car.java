package chap06.sec04.exam05;

/**
 * packageName : chap06.sec04.exam05
 * fileName : Car
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Car {
    int speed;

    void keyTurnOn(){
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for (int i = 10; i < 60; i += 10) {
            System.out.println("달립니다. (시속 : " + i + " km/h )");
            speed = i;
        }
    }

    int getSpeed() {
        return speed;
    }

}
