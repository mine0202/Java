import chap02.Sec0201;

public class JavaApplication {

//    main 함수 클래스(객체) 안에서 한번만 쓸수 있음
//    다른 클래스 (객체) 사용하는 함수를 출력용, 입력용 등으로 최종 사용
    public static void main(String[] args) {
        //    객체를 생성해서 함수를 호출함 : 객체 지향 코딩
        //    클래스명(객체명) 변수명 = new(메모리에 객체 생성 명령) 객체생성자함수(클래스명());
        Sec0101 sec0101 = new Sec0101();
        // 객체 함수 호출
        sec0101.exam01();

//        Sec0101 클래스 (객체) 정의 : exam02()
//        업무로직 : 자바 자료형 ( 숫자 자료형(정수) :int )
//        힌트 ) int x = 1; int y = 2;
//         int result = x + y ;
//        sout (출력함수 )

//        위 내용을 Sec0101.java 클래스로 가서 다음과 같이 코딩하여 아래와 같이 불러온다.

//  public class Sec0101 {
//    public void exam02() {
//        int x = 1;
//        int y = 2;
//        int result = x+ y;
//        System.out.println(result);
//    }
//  }
        sec0101.exam02();


//        1) Sec0201 객체 생성
//        2) 위의 객체의 함수 호출
//         자동 import : alt + enter
        Sec0201 sec0201 =new Sec0201();
        sec0201.exam01();

        sec0201.exam02();
        sec0201.exam03();
        sec0201.exam04();

    }
}
