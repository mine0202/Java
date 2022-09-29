package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
 * fileName : StudentApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student("홍길동", "12345-1234567",1 );

        System.out.println("이름 : "+ student.name);
        System.out.println("번호 : "+ student.ssn);
        System.out.println("학번 : "+ student.studentNo);
    }
}
