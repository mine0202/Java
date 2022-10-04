package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : Car
 * author : ds
 * date : 2022-09-30
 * description :
 * 요약:
 *      자동 타입 변환 : 구현 객체가(자식클래스) 인터페이스(부모) 변수에 대입되는 것
 *      다형성 : 1.상속은 같은 종류의 하위 클래스를 만드는 기술,
 *              2.인터페이스는 사용방법이 같은(함수의 선언이 같다) 클래스를 만드는 기술
 *              3.강제타입변환 - 인터페이스에 저장된 구현 객체(자식클래스)를
 *                다시 구현클래스(자식클래스)로 변환하는 것(원복)
 *              instanceof : 강제 타입변환을 하기 전에 변환 가능한지 조사할때 사용하는 연산자
 *                인터페이스(부모)안에 구현객체(자식클래스)가 있는지 조사할 때 사용
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class Car {
    Tire frontLeftTire = new HankookTire();
    Tire frontRightTire = new HankookTire();
    Tire backLeftTire = new HankookTire();
    Tire backRightTire = new HankookTire();

    void run(){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
