package chap02;

public class Sec0201 {
//    속성 ( 멤버변수 )

//    함수 ( 멤버메소드 )
//    public : 접근자(접근제어자) ,  다른 객체에서 아무나 접근할 수 있다.
//    void : 반환값이 없음(return 값이 없는 함수)을 표시함
//    접근자 void(반환값이 있으면 그 값의 자료형을 적어준다: int,String..) 함수명() {}
//    자바스크립트에서는 function 함수명 () {}  이었음.
    public void exam01() {
        int value = 20;
        int result = value +20 ;
        System.out.println(result);
//        result + 20 출력하기;
//        main 함수 안에 객체를 생성해서 함수 호출해서 출력하세요.
    }

//    exam02() 함수( 메소드)
    public void exam02() {
//        숫자(정수) 자료형 int 변수명 = 값;
        int hour = 3;
        int minute = 5;

//        3시간 5분으로 출력하기
//        문자열 붙이기 : +
        System.out.println(hour+"시간 "+minute+"분");

//        총 185 분 출력
        System.out.println("총"+hour*60+minute+"분");

    }

    public void exam03(){
        int x = 3;
        int y = 5;
//        x:3 , y:5 출력
        System.out.println("x:"+x+", y:"+y);
//         변수 swap
//        x:5 , y:3 출력
//        임시변수를 만들어서 값을 보관
        int temp = x;
        x = y;
        y=temp;
        System.out.println("x:"+x+", y:"+y);
    }

    public void exam04(){
        int v1 = 15;
//      조건문 (if / else )
//        v1 > 10 출력 10보다 큼
//        아니면 10보다 작음
        if (v1 >10){
            int v2 = 10 ;
            System.out.println(v2+"보다 큼");
        }
        else {
            System.out.println("10보다 작음");
        }
//        int result = v2 +20;
    }
}
