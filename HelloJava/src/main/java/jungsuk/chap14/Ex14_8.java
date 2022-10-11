package jungsuk.chap14;

//  590 페이지

// Optional 사용하기

import java.util.Optional;

public class Ex14_8 {
    public static void main(String[] args) {
//      Optional  : null 방지 클래스
//        null 포인터 예외 너무 많이 발생해서 해결하기 위해 Optional 클래스를 만듬
//      기본자료형 int 를 Wrapper 클래스 를 만들면 Integer ( 정수 객체 )가 된다
//        String 객체 를 Wrapper 클래스 -> Optional<String>  : null 방지
//        Optional.of(값) : Optional 객체에 값 넣기
        Optional<String> optStr = Optional.of("abcde"); // abcde 문자열 객체 생성
//        Optional 값을 가져오기
        System.out.println("optStr="+ optStr.get());
        System.out.println("----------------------");

        Optional optional = Optional.of(0); // 0을 저장
        Optional optional2 = Optional.empty(); // 빈객체 생성

//        optional 안에 객체가 있는지 없는지 체크
        System.out.println(optional.isPresent()); // 있으면 true
        System.out.println(optional2.isPresent()); // 없으면 false
        System.out.println("----------------------------");

        System.out.println(optional.get()); // 값가져오기
//        System.out.println(optional2.get()); // 값가져오기 NoSuchElementException 에러발생
        System.out.println(optional2.orElse("없음")); // 에러발생하면 "없음" 표시


    }
}
