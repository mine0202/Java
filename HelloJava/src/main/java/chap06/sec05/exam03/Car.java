package chap06.sec05.exam03;

/**
 * packageName : chap06.sec05.exam03
 * fileName : Car
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
//    공유변수(함수) 쓸때의 주의점

public class Car {
    int speed;

    void run(){
        System.out.println(speed + " 의로 달립니다.");
    }
//    main 함수가 static 이므로 공유함수이다. 그래서 this.speed = 60; 으로 바로 불러 사용할 수없다.
//    공유함수에서는 객체를 만들어서 사용해야한다.
    public static void main(String[] args) {
//        this.speed = 60; //에러 발생

        Car car = new Car();
        car.speed = 60;
    }
}
