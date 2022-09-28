package chap06.sec05.exam05;

/**
 * packageName : chap06.sec06
 * fileName : PersonApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class PersonApplication {
    public static void main(String[] args) {
        Person person = new Person("1234567-123479","홍길동");
        System.out.println(person.nation);  // 상수 출력
        System.out.println(person.ssn);  //  출력
        System.out.println(person.name);  //  출력

//        person.name = " 강감찬";
//        person.nation = "CANADA"; // 상수기 때문에 변경불가.
//        person.ssn = "12345678-1234578";  // 상수기 때문에 변경불가.

    }
}
