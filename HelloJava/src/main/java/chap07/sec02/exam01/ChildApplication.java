package chap07.sec02.exam01;

/**
 * packageName : chap07.sec02.exam01
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
//        자식클래스 객체 생성
        Child child = new Child();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

//        다형성 ( 상속관계에서 사용가능 ) : 사용방법은 동일하지만 다양한 객체를 이용해서다양한 실행결과가
//                                      나오도록 하는 것
//        자동타입변환 : 부모객체 = 자식객체
//        껍데기는 부모클래스지만 알맹이는 자식클래스, 재정의한 함수 호출
//        장점 -
//            ex) 자동차의 타이어를 끼워넣는 방법은 일정하지만
//                일반타이어 또는 고급타이어 ... 어떤타이어를 끼워넣는지에 따라 성능이 달라짐

//        다형성을 구현하기 위해서는 재정의한 함수 + 타입변환(형변환)
        Parent parent = child2;

        parent.method1(); // 자식클래스에는 없고 부모클래스에 있으므로 부모함수 호출
        parent.method2(); // 자식클래스에 있으므로 자식클래스에 있는 재정의한 함수호출됨

        child.method1();
        child.method2();
        child.method3();
    }
}
