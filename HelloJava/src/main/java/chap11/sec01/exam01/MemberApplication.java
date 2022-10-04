package chap11.sec01.exam01;

/**
 * packageName : chap11.sec01.exam01
 * fileName : MemberApplication
 * author : ds
 * date : 2022-10-04
 * description : 실행클래스 . 비교
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class MemberApplication {
    public static void main(String[] args) {
        Member member = new Member("blue");  // 방번호 1
        Member member2 = new Member("blue"); // 방번호 2
        Member member3 = new Member("red");  // 방번호 3

//        member 와 member2 를 배교를 하면 틀리다고 나옴. 객체의 방번호(주소값)을 비교함.
        if (member.equals(member2)) {
            System.out.println("member와 member2는 같습니다.");
        } else {
            System.out.println("member와 member2는 다릅니다.");
        }

    }
}
