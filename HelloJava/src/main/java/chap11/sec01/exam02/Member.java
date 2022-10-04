package chap11.sec01.exam02;

/**
 * packageName : chap11.sec01.exam01
 * fileName : Member
 * author : ds
 * date : 2022-10-04
 * description : 객체를 동등비교 ( .hashCode() )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
// 해쉬코드(hashCode) : 객체를 식별하는 유일한 정수값 ( 번호는 중복되면 안됨)
//    .hashCode() 함수는 객체가 메모리에 저장된 방번호(주소)를 가지고,유일한 값을 만듬(정수)
//    객체를 비교할때
//    1) HashMap , HashSet 라는 자료구조(배열과 비슷)를 사용할때 해쉬코드를 사용함.
//    객체간 비교에서 .hashCode() 함수를 재정의 안하면 위에서 오류가 발생함(재정의해야함)
//    아래 어노테이션

public class Member {
//    속성
    public String id;

//    생성자
    public Member(String id) {
        this.id = id;
    }

//    Object : 객체의 최고 조상( 부모 ) 클래스

//    해쉬코드 재정의
//    id 속성이 2개가 같으면 해쉬코드도 같음.
//    String 객체의 특징 : 문자열이 같으면 같은 방번호를 씀 그래서 해쉬코드도 같음.
    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
