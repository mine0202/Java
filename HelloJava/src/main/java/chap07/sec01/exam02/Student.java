package chap07.sec01.exam02;

/**
 * packageName : chap07.sec01.exam02
 * fileName : Student
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Student extends People {
    public int studentNo;

//    new 객체를 만들면 생성자를 생성자를 호출 순서는  부모생성자 먼저 호출  자식생성자 나중 실행
//    그래서 super 를 사용.

    public Student(String name, String ssn, int studentNo) {
        // 부모의 생성자를 호출하는 함수 , super (매개변수값1, 매개변수값n )
        super(name, ssn);
        this.studentNo = studentNo;
    }
}
