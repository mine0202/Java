package chap11.sec02.exam05;

/**
 * packageName : chap11.sec02.exam05
 * fileName : Member
 * author : ds
 * date : 2022-10-05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class Member {
//     속성 정의
    public String name; // 이름
    public int age;     // 나이

//  생성자
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    name과 age 값이 같으면 같은 객체라고 .equals() 재정의

// name 과 age 값이 같으면 동일한 hashcode() 값이 리턴
    @Override
    public int hashCode() {
        return name.hashCode() + age;  // name.hashCode() 정수 이고 age 도 정수
    }

//    name 과 age 값이 같으면 true 리턴 , 아니면 false 리턴
    @Override
    public boolean equals(Object obj) {
        if( obj instanceof Member){  // 부모클래스가 있는지 확인.
            Member member =( Member) obj;  // 클래스 원복
            return this.name.equals(member.name) && (this.age==member.age);
        }
        else {
            return false;
        }

    }
}
