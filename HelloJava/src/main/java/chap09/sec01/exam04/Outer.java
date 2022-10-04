package chap09.sec01.exam04;

/**
 * packageName : chap09.sec01.exam04
 * fileName : Outer
 * author : ds
 * date : 2022-10-04
 * description : 지역(로컬) 클래스에서 사용제한 (함수안의 클래스)
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class Outer {
    public void method2(int arg){
//        지역변수이지만 지역 클래스가 있을 경우에 상수로 변홤되어서 중간에 값을 변경못함.
        int localVariable = 1;

//        지역클래스
        class Inner {
            public void method(){
                int result = arg + localVariable;  // 가능
            }
        }
    }
}
