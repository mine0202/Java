package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : Computer
 * author : ds
 * date : 2022-09-29
 * description : 자식클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Computer extends Calcuator{

// 함수 재정의 3.14 대신에 Math.PI 를 사용하기 위해서.
//    함수 재정의를 하면 자신의 함수가 실행됨. ( 보모함수는 무시 )
//    @Override : 오버라이딩 된 함수임을 표시 ,
//              부모 함수 선언부 == 자식함수 선언부 일치해야하는데
//              일치하지 않으면 아래 어노테이션 에러를 발생키져줌
    @Override
    double areaCirecle(double r){
        System.out.println("Computer 객체의 areaCircle() 함수 실행");
        return Math.PI*r*r ;
    }
}
