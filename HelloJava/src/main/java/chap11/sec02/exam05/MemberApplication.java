package chap11.sec02.exam05;

import java.util.HashSet;
import java.util.Set;

public class MemberApplication {
    public static void main(String[] args) {
//        <> 제너릭 ( 자료형을 제한 )
        Set<Member> set = new HashSet<>();

//        .equals(), .hashcode() 재정의 되었으면 중복 제거가됨.
        set.add(new Member("홍길동",30));
        set.add(new Member("홍길동",30));

        System.out.println("총 객체수 : "+ set.size());
    }
}
