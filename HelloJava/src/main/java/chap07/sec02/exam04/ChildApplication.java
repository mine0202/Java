package chap07.sec02.exam04;

/**
 * packageName : chap07.sec02.exam04
 * fileName : ChildApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class ChildApplication {
    public static void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

//        parent.method3();  자식의 함수는 사용할 수 없음( 에러 )
//        parent.field2 = "data2"; 에러

//        강제 형변환 : 자식객체 = (자식객체) 부모객체
//        주의점 : 부모객체에 현재 자식객체 자동형변환이 되어 있어야함.

//         ex) 일반자료형:     double doubleNum =3.14;
//                          int a = (int) doubleNum;
        Child child = (Child) parent;  // 강제 형변환
        child.field2 ="data2"; // 자식객체의 고유 속성
        child.method3();  // 자식 객체의 고유함수 호출
    }
}
