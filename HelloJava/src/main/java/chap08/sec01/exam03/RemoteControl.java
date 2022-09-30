package chap08.sec01.exam03;

/**
 * packageName : chap08
 * fileName : RemoteControl
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */

// 인터페이스 : 추상클래스와 비슷, 내부에 정의되는 함수 전부 추상함수.
//            일반함수는 정의할 수 없음
//    함수 : 전부 추상함수
//    속성 : 전부 상수(공유상수)
//    목적 : 명명규칙 일반화, 표준화, 다형성을 활용하기 위한 목적으로 생성
//    인터페이스는 부모클래스 역할
//    구현클래스 ( 자식클래스 )에서 전부 정의해줘야함
public interface RemoteControl {
    // 상수 (공유상수,대문자)  static final 이 앞에 있어야하지만 interface 에서는 생략
    int MAX_VOLUMN = 10;  // 최대볼륨
    int MIN_VOLUMN = 1;   // 최소볼륨

//    함수 만들기
//    추상함수는 함수선언부만 있고 실행 블럭 { } 이 없음 , abstract 생략됨.
    void turnOn();  // 켜기함수
    void turnOff();  // 끄기함수
    void setVolumn(int volumn); // 볼륨조절함수

}
