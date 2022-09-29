package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : Animal
 * author : ds
 * date : 2022-09-29
 * description : 추상클래스, 추상함수
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public abstract class Animal {
//    속성
    public String kind;

//    공통함수
    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }

//    추상함수 :  함수의 선언부만 있고 실행 블럭인 { } 중괄호가 없다.
    public abstract void sound();

}
