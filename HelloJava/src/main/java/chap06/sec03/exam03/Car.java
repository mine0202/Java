package chap06.sec03.exam03;

/**
 * packageName : chap06.sec03.exam03
 * fileName : Car
 * author : ds
 * date : 2022-09-27
 * description :생성자
 * 요약:
 *      기본생성자 : 클래스 선언 시 컴파일러에 의해 자동으로 추가되는 생성자
 *              (생성자가 있을 경우 자동 추가되지 않음)
 *      생성자 정의 : 객체를 생성할 때 호출되는 함수로 주로 속성의 초기값을 저장하는 용도로 사용
 *      매개변수 : 생성자 호출 시 값을 전달 받기 위해 선언되는 변수
 *      오버로딩 : 매개변수 타입, 개수 순서가 다를 경우 생성자를 같은 이름으로 여려개 정의하는 것을 허용
 *      this  :  객체 자기자신을 의미하는 객체변수 , 클래스 내부에서만 사용가능
 *          사용 법 : this.속성
 *      this() : 클래스 내부에서 이미 정의된 생성자를 호출할 때 사용
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
    //     생성자 이름이 같더라도 매개변수 개수와 타입이 다르면 허용해줌. 생성자 오버로딩이라고함.
//    객체지향 언어에서 제공하는 기능
//    오버로딩 : 일반적으로 함수명이 같이면 에러발생함.
//               단, 매개변수 타입(자료형),개수가 다르다면 허용함.
//    생성자에서 많이 사용해서 생성자 오버로딩이라고 많이 함.

//  생성자의 매개변수명 == 속성의 이름이 같은 경우 사용
//    this.속성명 = 매개변수명;

//     this() == Car ()
//    this() 생성자를 호출할 수 도 있음
//    this("현대자동차") == Car("현대자동차")
//    this("현대자동차","검정") == Car("현대자동차","검정")
    public Car() {
    }

    public Car(String company) {
        this.company = company;
    }


    public Car(String company, String model) {
//        this.company = company;
//        this.model = model;
        this(company,model,null,0);
    }

    public Car(String company, String model, String color) {
//        this.company = company;
//        this.model = model;
//        this.color = color;
        this(company,model,color,0);
    }

    public Car(String company, String model, String color, int maxSpeed) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
