package chap06.sec04.exam03;

/**
 * packageName : chap06.sec04.exam03
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
        Car car = new Car();

        car.setGas(5);   // gas = 5;

        boolean gasState = car.isLeftGas();  // gas 있으면 true, 없으며 false

        if(gasState){
            System.out.println("출발합니다.");
            car.run();    // 반복문 실행됨, gas--;  줄어듬
        }

        if(car.isLeftGas() == true) {
            System.out.println("gas를 주입할 필요가 없습니다.");
        }
        else {
            System.out.println("gas를 주입하세요.");
        }

    }
}
