package chap11.sec02.exam01;

import java.util.ArrayList;
import java.util.List;

//List : 인터페이스(부모), 배열을 모바해서 개선한 자료구조
//      구현(자식)클래스 : ArrayList , Vector, LinkedList 등
public class ArrayListApplication {
    public static void main(String[] args) {
//        다형성 : 인터페이스(부모) 변수명 = new 구현클래스();
//        list 객체에 Arraylist , Vector , LinkedList 등 다양하게 넣을 수 있음.
        List<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>(); // 이렇게 사용해도 되지만 나중에 변경하게되면 번거로움.
//        <제한할 자료형> 제네릭 ,객체 자료형을 제한하기 위해 사용함.


//        개선된 배열 : ArrayList
//        객체.add(문자열) : 개선된 배열에 자료 생성하는 함수
        list.add("Java");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2,"Database");
//        실무 에서는 JPA ( 단순 질의 ) + myBATIS ( 복잡한 질의 )  둘다 사용
        list.add("myBATIS");  // Springboot framework 데이터베이스와 연결하기 위한 또다른 프레임워크

        System.out.println(list);

//        배열 크기 가져오기 , 배열에서는 size() 사용 ... 에서는 length()사용
         int size = list.size();
        System.out.println(size);

//        3번째 자료 가져오기
        String skill = list.get(2);  // 0 부터 시작함
        System.out.println(skill);

//        ArrayList 안의 자료 모두 출력하기
        for (int i = 0; i < list.size(); i++) {
//            객체.get(인덱스번호) : 인덱스번호에 해당하는 자료 조회하기(검색하기)
            String str = list.get(i);
            System.out.println(i+":"+str);
        }

        System.out.println(); // 줄바꿈
//        삭제하기
//        중간에 삭제되면 뒤에 자료가 그 공간으로 자동 당겨짐
//        중간에 추가되면 뒤에 한칸씩 밀림
        list.remove(2);  // 3번째가 삭제되어 4번째가 3번째가됨
        list.remove(2);  //  다시 3번째 삭제
        list.remove("myBATIS");

        for (int i = 0; i < list.size(); i++) {
//            객체.get(인덱스번호) : 인덱스번호에 해당하는 자료 조회하기(검색하기)
            String str = list.get(i);
            System.out.println(i+":"+str);
        }
    }
}
