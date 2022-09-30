package chap07.verify.exam01;

/**
 * packageName : chap07.verify.exam01
 * fileName : Student
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 문제 : 아래 자식 클래스 정보를 보고 부모클래스를 완성하세요.

public class Student extends Person{
    void set(){
        age = 30;
        name = "홍길동";
        height = 175;
        setWeight(99);
    }
}
