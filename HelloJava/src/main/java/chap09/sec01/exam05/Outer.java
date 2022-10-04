package chap09.sec01.exam05;

import javax.print.attribute.standard.MediaSize;

/**
 * packageName : chap09.sec01.exam05
 * fileName : Outer
 * author : ds
 * date : 2022-10-04
 * description : 중첩클래스 안에서 바깥쪽 this 참조
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class Outer {
    String field = "Outer-field";
    void method(){
        System.out.println("Outer-method");
    }

    class Nested{
        String field = " Nested-field";

        void method(){
            System.out.println("Nested-method");
        }
        void print() {
            System.out.println(this.field); // Nested 의 field 를 의미, 중첩클래스의 속성 접근
            this.method();  // Nested 의 method 를 의미함 , 중첩클래스의 함수를 호출

//        바깥쪽 클래스의 속성/함수 접근
            System.out.println(Outer.this.field);  // 바깥쪽 클래스 속성에 접근
            Outer.this.method();  // 바깥쪽 클래스의 함수에 접근
        }
    }
}
