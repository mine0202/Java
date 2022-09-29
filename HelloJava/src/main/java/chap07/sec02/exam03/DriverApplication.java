package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : DriverApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class DriverApplication {
    public static void main(String[] args) {
        Driver driver = new Driver();

//        Vehicle 의 자식 객체들
        Bus bus = new Bus();
        Vehicle vehicle = new Vehicle();
        Taxi taxi = new Taxi();

        driver.driver(bus);
        driver.driver(taxi);
        driver.driver(vehicle);
    }
}
