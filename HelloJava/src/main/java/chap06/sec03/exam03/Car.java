package chap06.sec03.exam03;

/**
 * packageName : chap06.sec03.exam03
 * fileName : Car
 * author : ds
 * date : 2022-09-27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
public class Car {
//    속성
    String company =" 현대자동차";
    String model;
    String color;
    int maxSpeed;

    public Car() {
    }
//     생성자 이름이 같더라도 매개변수 개수와 타입이 다르면 허용해줌. 생성자 오버로딩이라고함.
//    객체지향 언어에서 제공하는 기능
//    오버로딩 : 일반적으로 함수명이 같이면 에러발생함.
//               단, 매개변수 타입(자료형),개수가 다르다면 허용함.
//    생성자에서 많이 사용해서 생성자 오버로딩이라고 많이 함.


    public Car(String company, String model, String color, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
