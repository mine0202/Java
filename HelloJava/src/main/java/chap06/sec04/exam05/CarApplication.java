package chap06.sec04.exam05;

/**
 * packageName : chap06.sec04.exam05
 * fileName : CarApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */

//    키를 돌립니다.
//    달립니다. (시속 : 10 km/h )
//    달립니다. (시속 : 20 km/h )
//    달립니다. (시속 : 30 km/h )
//    달립니다. (시속 : 40 km/h )
//    달립니다. (시속 : 50 km/h )
//    현재 속도 : 50 km/h

public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();
        car.keyTurnOn();  // 키를 돌립니다. 출력
        car.run();  // 5개의 달립니다.
        int speed = car.getSpeed();  // 현재 속도 값을 리턴
        System.out.println("현재속도 : " + speed +"km/h" );
    }
}
