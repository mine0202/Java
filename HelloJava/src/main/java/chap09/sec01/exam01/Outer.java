package chap09.sec01.exam01;

/**
 * packageName : chap09.sec01.exam01
 * fileName : Outer
 * author : ds
 * date : 2022-10-04
 * description :특수클래스 - 중첩클래스 ( 클래스 안에 클래스) , 안드로이드 이벤트 처리에서 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class Outer {
//    기본생성자 :  매개변수 없는 생성자
    public Outer() {
        System.out.println("Outer 잭체가 생성됨");
    }

//    속성의 형태 클래스가 있을 수 있음: 일반 중첩 클래스(인스턴스 맴버 클래스)
    public class Attr{
//        중첩클래스 생성자
        public Attr() {
            System.out.println("Attr 중첩 클래스 객체가 생성됨");
        }
        int field1; // 중첩클래스 속성( == 필드 == 멤버 변수 == 인스턴스 변수 )
//    중첩클래스 함수
        void method1(){ }
    }


//    공유 중첩 클래스
    static class Share {
        public Share() {
            System.out.println("Share 공유 중첩 클래스 객체가 생성됨");
        }
        int field1; // 일반속성
        static int field2; // 공유 속성

        void method1(){ } // 일반함수
        static void method2(){ } // 공유함수
    }

//    로컬(지역) 클래스  , Outer class의 일반함수안에 클래스
    void method(){
//        지역클래스
        class Local{
            public Local() {
                System.out.println("Local 지역클래스 객체가 생성됨");
            }
            int field1;
            void method1(){ }

        }
//        지역 중첩 글래스 객체 생성
        Local local = new Local();  // 클래스를 불러와서 다음과 같이 사용할수 있음.

        local.field1 =3;  // 지역 중첩 객체의 속성
        local.method1();  // 지역 중첩 객체의 함수
    }
}
