package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : Calcuator
 * author : ds
 * date : 2022-09-29
 * description : 함수 오버라이딩 ( 재정의 ) , 부모클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Calcuator {
//    매개변수 반지름 r 을 받아 원의 넓이를 구하는 함수
    double areaCirecle(double r){
        System.out.println("Carculator 객체의 areaCircle() 함수 실행");
        return 3.14*r*r ;
    }
}
