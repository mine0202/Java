package jungsuk.chap14;

import java.util.*;

//  Stream 의 유용한 함수들
public class StreamApplication {
    public static void main(String[] args) {
//        샘플 배열
        String[] strArr = {"Hwang","Long","Jang"};

//        배열을 List 변환 . Arrays.asList()
        List<Integer> integerList = Arrays.asList(1,2,3);  // 정수형 배열을 List로 생성
        List<String> stringList = Arrays.asList(strArr);  // 문자형 배열을 List로 생성

//        Arrays sort
        Arrays.sort(strArr); // 배열정열
        Collections.sort(stringList); // 자료구조 정열

//        List 출력 , forEach
        for (String str : stringList) {
            System.out.println(str); // 정렬된 List 출력
        }

        System.out.println("------stream forEach --------------");
// stream 추상화된 가상된 구조 -> 유용한 함수 많음  , 함수형 프로그래밍의 함수를 차용
//       stream 의 대상:  주로 자료구조(List, Map, Set)를 이용함.
//        정렬 + 출력
        stringList.stream()
                .sorted()  //정렬
                .forEach(x-> System.out.println(x)); // 출력

//      filter : 배열의 조건을 걸어서 새로운 배열을 만듬.
//              원본배열에서 조건에 해당하는 배열만 재생성
//        정수배열 : 3보다 적은 정수를 갖는 배열로 재생성
        integerList.stream()
                .filter( x -> x<=2) // 2이하의 수를 고름
                .forEach(x-> System.out.println(x)); // 출력  12

//        중복값제거한 자료구조List 생성
        Arrays.asList(1,2,3,2,5).stream()
                .distinct()  // 중복제거
//                .forEach(x-> System.out.print(x)); //출력  1235
                .forEach(System.out::print);  //이렇게 표현도 가능. 람다식

        System.out.println();
        System.out.println("----------------map------------------");

//        map 은 값을 변경시키는 것
//        스트림의 각 요소마다 수행할 연산을 구현할 때 사용: 새로운 자료구조(List) 만들때 사용
        integerList.stream()
                .map(x-> x*x)  // 1,2,3 을 1*1 , 2*2, 3*3 의 값으로 변경
                .forEach(System.out::println);   // 출력


        System.out.println("----limit------------");
//                limit ( 제한값 )
//        시작 요소로 부터 매개변수값으로 전달된 인덱스까지만 추출
        integerList.stream()
                .limit(2)
                .forEach(System.out::print);  // 1,2 출력됨


        System.out.println("\n-------skip------------");
//        skip (값)
        integerList.stream()
                .skip(2)  // 2까지는 무시
                .forEach(System.out::println);  // 2까지 무시하고 3만 출력됨

        System.out.println("--------------------------");
//        오름차순 / 내림차순 정렬

//        오름차순 정렬
        Arrays.asList(1,4,3,2).stream()
                .sorted()
                .forEach(System.out::print);

        System.out.println("\n---- .sorted(Comparator.reverseOrder()) 내림차순-----");
        Arrays.asList(1,4,3,2).stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::print);

    }
}
