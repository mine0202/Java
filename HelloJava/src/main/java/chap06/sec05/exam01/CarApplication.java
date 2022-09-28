package chap06.sec05.exam01;

/**
 * packageName : chap06.sec05.exam01
 * fileName : CarApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car("포르쉐");
        Car car2 = new Car("벤츠");

        car.run();
        car2.run();

    }
}
