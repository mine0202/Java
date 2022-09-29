package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : Driver
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Driver {
//    운전 함수
//    매개변수 Vehicle (부모클래스)
//    다형성 : 자식객체인(Bus, Taxi) 2개중에 1개를 전달하면
//           Bus 객체 전달하면 Bus.run() 실행
//           Taxi 객체 전달하면 Taxi.run() 실행
    public void driver(Vehicle vehicle){
        vehicle.run();  // 형태는 부모클래스의 run() 이지만 실행시점에 Bus, Taxi 를 넣게되면 다형성으로 바뀐다.
    }
}
