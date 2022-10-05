package chap11.sec02.exam04;

import java.util.HashSet;
import java.util.Set;

//    Set : 집합을 표현한 인터페이스, 구현한 클래스 HashSet , LinkedHashSet, TreeSet 등
//    Set  특징 : 순서가 없음, 중복이 허용되지 않음.
//          강제로 중복된 데이터를 넣으면 나중에 들어간 데이터로 덮어짐
public class HashSetApplication {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

//      .add(객체) :  set 자료추가
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("myBATIS");

//        자료크기보기
        int size = set.size();
        System.out.println("총 객체수 : "+size); // "Java 가 중복되어 4 나옴.

//        자료 출력
        for( String element : set){
            System.out.println("\t"+element);  // \t 는 앞 띄우기
        }
// 줄바꿈
        System.out.println("----------------");
//        자료 삭제하기, 집합에는 인덱스 번호 없음.
        set.remove("JDBC");
        set.remove("myBATIS");

        for( String element : set){
            System.out.println("\t"+element);  // \t 는 앞 띄우기
        }
// 줄바꿈
        System.out.println("----------------");
//        모두 삭제
        set.clear();
//        set.isEmpty() : 집합에 자료가 있는지 없는지 검사, 없으aus true, 있으면 false
        if (set.isEmpty() == true ){

            System.out.println("비워있음");
        }
    }
}
