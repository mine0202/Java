package chap05;

/**
 * packageName : chap05
 * fileName : Sec0501
 * author : ds
 * date : 2022-09-26
 * description : 배열, 참조 타입
 * 요약:
 *      기본자료형 : byte , short (2byte, 정수형 ) , int , long , floot, couble, boolean
 *                스택 메모리 방에 값이 바로 저장
 *      참조자료형 : 객체, 배열, 열거형(enum)
 *                스택방의 값에 힙방번호(주소) 저장, 힙메모리방에 객체 값이 저장됨
 *      JVM ( 자바 ) 메모리 구조 : 메소드방(코드,클래스, 함수, 생성자, 전역변수),
 *                              스텍방(지역변수, 매개변수)
 *                              힙방(객체, 배열, 열거형)
 *      비교연산자(==) : 참조자료형은 방번호(주소)를 비교,
 *                     기본자료형은 값을 비교
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-26         ds          최초 생성
 */
public class Sec0501 {
//    속성 생략(멤버 변수)

//    함수(멤버 메소드)

    public void stringEqualExam01(){
//


//        메모리에 어떻게 저장이 될까요?
//         어느 메모리 공간에 저장이 될까요?
//         코딩언어 : 프로그램을 개발 -> 메모리에 로딩( 적제 ) 되고 실행
//         예) 파일 관리 : 01_HTML폴더
//                       02_Vue 폴더
//                       03_Java 폴더
//        A,B,C 세분화해서 위에 처럼 각각 용도에 맞게 관리가 됨.
//        메모리에는 3개의 방이 있다.  스텍방 , 메소드방, 힙방
//        기본 자료형 -> 스텍방에 저장 (기본자료형 ,   지역변수 / 매게번수)
//                     메소드방 ( 프로그램 코드 , 플래스 코드들, 전역변수 (정적변수 ),함수) : 공유방.
//                     힙방 ( 참조자료형, 객체, 배열 )
//        int , double , String , boolean ( 기본타입(자료형))
//        int age = 25;
//        double price = 100.5;
//         스택방 ( LIFO : 마지막에 들어간 변수가 먼저 나옴 ) 2번방에 있는 100.5 가 먼저 나옴.
//        주소 : 변수명 | 값
//         2번방 : price | 100.5
//         1번방  : age | 25

//        참조 자료형 살펴보기
//        자바에서 String 객체에서 strVal1, strVal2 의 값이 같으면 무조건 방번호를 일치
//         String 객체 = 이용해서 만들면 힙방( String 을 위한 전용 방) 에 생성
        String strVal1 ="신민철"; // 10번 저장
        String strVal2 ="신민철"; // 10번 저장


//        스택방                                힙방
//        주소 : 변수명 | 값                     주소 : 값
//        1번방 : strVal1 | 10번 힙방 <------    10번 : " 신 "
//                                             11번 : " 민 "
//                                             12번 : " 철 "
//        2번방 : strVal2 | 10번 힙방 <------

//        참조 자료형은 커서 스택방에 직접 넣지 못하고 힙방에 저장한후에 스택방 값 부분에 힙방번호를 넣어놓는다.

//        1) 참조자료형일(객체,배열) 경우 두 변수의 주소값(방번호)을 비교
//        2) 기본 자료형이면 두 변수의 값을 비교
        if( strVal1 == strVal2){
            System.out.println(" srtVal1 == strVal2 입니다.");
        }
        else {
            System.out.println(" srtVal1 != strVal2 입니다.");
        }
//        .equals 문자열 비교
        if( strVal1.equals(strVal2)){
            System.out.println("srtVal1 와 strVal2 문자열이 같음");

        }
//         String 객체 = 이용해서 만들면 힙방( String 을 위한 전용 방: String Constant Pool) 에 생성
        String strVal3 ="신민철"; // 10번 저장

//        String 객체 생성 ( new 이용 )  -> 힙 메모리방에 생성 ( 전용공간이 아닌 일반 힙공간 생성 )
        String strVar3 = new String ("신민철");
        String strVar4 = new String ("신민철");


//        스텍 메모리 방                          힙 메모리 방
//        주소  : 변수명   | 값                   주소  |  값
//        1번방 : strVar3 | 1번방( 힙방 ) <-----  1번방 | "신"
//                                              2번방 | "민"
//                                              3번방 | "철"
//        2번장 : strVar4 | 10번방 (힙방 ) <---- 10번방 | "신"
//                                             11번방 | "민"
//                                             12번방 | "철"

//        방번호가 다르기때문에 비교 == 의 경우 다르나고 나오고 문자열 비교에서는 같다고 나옴.
        if( strVar3 == strVar4){
            System.out.println(" srtVar3 == strVar4 입니다.");
        }
        else {
            System.out.println(" srtVar3 != strVar4 입니다.");
        }
//        .equals 문자열 비교
        if( strVar3.equals(strVar4)){
            System.out.println("srtVar3 와 strVar4 문자열이 같음");

        }

//         자바언어의 문제점 : null 포인트 예외 ( 에러) 시도 때도 없이 나옴.
//        파이썬 -> null 포인트 예외 안남.

//       1)  null 포인트 에러 (예외)
//        int intArray[] = null ;  와 같음.
        int [] intArray = null ;
        intArray[0] = 10;
        // null 포인트 에러 발생

//        2) null 포인트 에러
        String str = null;
        System.out.println("총 문자수 :"+ str.length());  // null 포인트 에러 발생


        String strVar5 = new String ("신민철");
        String strVar6 = new String ("신민철");
        strVar5 = null;
        strVar6 = null;
//      아래 스택방 | 힙방 : 자바 gc (가비지 컬렉터, 쓰레기 수집기 ) 일정 시점에 메모리에서 자동으로 제거함
//         gc 가 작동할때는 성능이 많이 떨어지게됨
//      strVar5, strVar6 을 null 로 지정하여 스텍 메모리방과 힙 메보리방의 연결이 끊겨서 힙 메모리방에서
//        메모리 누수가 생기게 된다.

//        스텍 메모리 방                          힙 메모리 방
//        주소  : 변수명   | 값                   주소  |  값
//        1번방 : strVar3 | null                 1번방 | "신"
//                                              2번방 | "민"
//                                              3번방 | "철"
//        2번장 : strVar4 | null                10번방 | "신"
//                                             11번방 | "민"
//                                             12번방 | "철"

    }
}
