package chap08.sec02.exam03;

/**
 * packageName : chap08.sec02.exam03
 * fileName : VehicleApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 문제 아래 결과를 보고 bus클래스를 완성하세요.
//    결과:
//        버스가 달립니다.
//        버스가 달랍니다.
//        승차요금을 체크합니다.

public class VehicleApplication {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();

        Bus bus = (Bus)vehicle;

        bus.run();
        bus.checkFare();
    }
}
