package chap06.sec03.exam01;

/**
 * packageName : chap06.sec03.exam01
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
    String col;
    int ccNum;

//     생성자 (함수)
//    () 안에 메게변수가 없는 생성자 : 기본 생성자 라고 한다.
//    사용법 :  (접근제어자- 생략가능) 클래스명 () { 실행문 }
//    생성자 : 리턴타입(자료형) 없음.   int 클래스명(){ } 이런식으로 int 같은게 없음
//    클래스에 생성자 없으면 자바 언어 컴파일 시 자동으로 1개 만들어줌
//    만약에 생성자 있으면 안 만들어줌
    //     매개변수 2개 생성자

    Car(String color, int cc) {
//    속성의 초기화를 (초기값을 넣어두는곳) 담당
        col=color;
        ccNum = cc;
    }
}
