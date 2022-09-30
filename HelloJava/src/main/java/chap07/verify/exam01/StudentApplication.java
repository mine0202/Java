package chap07.verify.exam01;

/**
 * packageName : chap07.verify.exam01
 * fileName : StudentApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class StudentApplication {
    public static void main(String[] args) {
        Student student = new Student();
        student.set();

//        아래출력
//        age : 나이
//        name : "홍길동"
//        height : 175
//        weight : 99

        System.out.println("age :"+ student.age);
        System.out.println("name :"+ student.name);
        System.out.println("height :"+ student.height);
        System.out.println("weight :"+ student.weight);
    }
}
