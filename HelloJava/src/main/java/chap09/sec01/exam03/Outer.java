package chap09.sec01.exam03;

/**
 * packageName : chap09.sec01.exam03
 * fileName : Outer
 * author : ds
 * date : 2022-10-04
 * description : 일반 중첩 클래스의 사용 제한
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class Outer {
    int field1; // 일반 속성
    void method1(){} // 일반함수

    static int field2; // 공유속성
    static void method2(){} // 공유함수

//    일반 중첩클래스
    class Attr{
        void method(){
//            바깥쪽 클래스의 일반 속성/ 함수
            field1=10;  // 일반 속성 가능
            method1();  // 일반 함수 가능
            field2=10; // 가능
            method2(); // 가능
        }
    }

//    공유중첩클래스
    static class Share{
        void method(){
//           바깥쪽 클래스의 일반 속성/ 함수
//            field1 = 10 ;   불가
            field2 = 10; // 가능
//            method1();   불가
            method2();   // 가능

        }
    }
}
