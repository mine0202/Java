package chap06;

/**
 * packageName : chap06
 * fileName : StudentApplication
 * author : ds
 * date : 2022-09-27
 * description : 객체 실행
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
//        객체 생성 해서 출력
//        객체변수 : student 여러개를 만들 수 있음.
        Student student = new Student();
        student.myPrint();

        Student student2 = new Student();
        student2.myPrint();

        Student student3 = new Student();
        student3.myPrint();
    }
}
