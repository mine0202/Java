package chap11.sec01.exam03;

/**
 * packageName : chap11.sec01.exam03
 * fileName : SmartPhoneApplication
 * author : ds
 * date : 2022-10-04
 * description : 실행클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class SmartPhoneApplication {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("구글","안드로이드");

//        .toSting() 함수 : 객체를 문자열로 변환하는 함수
//        출력 : 패키지명+클래스명 @16진수 해쉬코드
//        개발자 기대하는 출력 : 속성의 값들을 보고 싶다.
//        그래서 .toString() 을 재정의.
        System.out.println(smartPhone.toString());
    }
}
