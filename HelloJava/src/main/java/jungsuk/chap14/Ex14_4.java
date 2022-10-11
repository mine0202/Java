package jungsuk.chap14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//컬렉션(자료구조) 과 함수형 인터페이스의 만남
// collection 인터페이스를 매개변수로 받는 함수
public class Ex14_4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

//        0~9 향상된 배열(ArrayList)  만듬
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

//        list 의 값을 모두 출력
//        내부적으로 for문이 돌고 있는 함수 : .forEach ( 람다식 )
        list.forEach(i -> System.out.print(i+","));
        System.out.println();
        System.out.println("-------------------------------");

//        list 에서 2또는 3의 배수를 제거함, removeIF (람다식 )
        list.removeIf(x -> x%2==0  || x%3 ==0);
        System.out.println(list);
        System.out.println("----------------------------------");

//        list 의 각 요소에 10을 곱한 값을 바꾸기
//        UnaryOperator 인터페이스 : ex) T apply(T t) 형태,
//        매개변수 자료형 == 리턴값 자료형일때 UnaryOperator 인터페이스라고함.
        list.replaceAll(i ->i *10);
        System.out.println(list);
        System.out.println("------------------------------");

//        HashMap 자료구조 ( 키, 값 )으로 이루어진 자료구조
        Map<String, String> map = new HashMap<>();
//        map 에 값추가
        map.put("1","가");
        map.put("2","나");
        map.put("3","다");
        map.put("4","라");

//        .forEach 를 이용해서 출력
        map.forEach((k,v) -> System.out.println("("+k+","+v+")"));


//        590페이지
    }
}
