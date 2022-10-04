package chap09.sec01.exam01;

import javax.print.attribute.standard.MediaSize;

/**
 * packageName : chap09.sec01.exam01
 * fileName : OuterApplication
 * author : ds
 * date : 2022-10-04
 * description : 중첩클래스의 사용법
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class OuterApplication {
    public static void main(String[] args) {
//        제일 바깥쪽의 클래스 객체 생성
        Outer outer = new Outer();

//        일반 (속성, 인스턴스멤버) 중첩클래스 생성 ( outer 객체 필요함.)
        Outer.Attr attr = outer.new Attr();
//        일반 중첩클래스의 속성 접근
        attr.field1 =3;
//        일반 중첩클래스의 함수 접근
        attr.method1();

//        공유 중첩 클래스의 객체 생성 ( outer 객체 필요 없이 바로 생성가능 )
        Outer.Share share = new Outer.Share();
//        공유 중첩 클래스의 일반 속성 접근 ( 일반속성에 접근하기 위해서 share 객체를 만듬.)
        share.field1 = 3;
        share.method1();

        Outer.Share.field2 = 3; // 공유중첩클래스의 공유 속성. ( share 객체 필요없음 )
        Outer.Share.method2();  // 공유중첩클래스의 공유 함수. (share 긱체 필요없음)

//      지역클래스 ( 함수안에 클래스 있는것) 객체 생성을 위한 함수 호출
        outer.method();  // outer 객체를 생성해서 함수를 호출하면됨.
    }
}
