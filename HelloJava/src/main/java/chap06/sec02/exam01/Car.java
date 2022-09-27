package chap06.sec02.exam01;

/**
 * packageName : chap06.sec02.exam01
 * fileName : Car
 * author : ds
 * date : 2022-09-27
 * description : 자동차 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
//자동차 객체 정의
public class Car {
//    객체의 속성 기본 초기화 : int 는 0 , double 는 0.0 , String 은 null , boolean 은 false
//    객체 속성 ( 기본 자료형, 참조자료형, 배열 모두 사용가능 )
//     사용법 : 자료형 변수명;
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 250;
    int speed;   // 기본 초기화 ( 0 )
}
