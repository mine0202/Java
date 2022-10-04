package chap09.sec01.exam02;

/**
 * packageName : chap09.sec01.exam02
 * fileName : Outer
 * author : ds
 * date : 2022-10-04
 * description : 중첩클래스의 공유 객체 와 일반 객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */

public class Outer {
//    일반 속성
    Attr attr =new Attr(); // 일반 중첩클래스의 객체를 바로 생성 가능
    Share share = new Share(); // 공유 중첩클래스도 바로 생성가능

//    일반 함수
    void method1(){
//        지역변수 : 함수 안에서만 사용되고 {} 밖으로 나갈수가 없는 변수
        Attr attr =new Attr(); // 일반 중첩클래스의 객체생성 가능
        Share share = new Share(); // 공유 중첩클래스 생성가능
    }

//    공유변수
//    static Attr attr3 = new Attr(); 공유변수에는 불가
      static Share share3 =new Share();  // 공유 중첩 클래스만 가능

//    공유 함수
    static void method2(){
//        지역변수
//        Attr attr =new Attr();     불가
        Share share = new Share();  // 가능
    }

//    일반 중첩 클래스
    class Attr { }

//     공유 중첩 클래스
    static class Share{ }
}
