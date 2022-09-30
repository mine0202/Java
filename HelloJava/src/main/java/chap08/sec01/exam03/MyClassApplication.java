package chap08.sec01.exam03;

/**
 * packageName : chap08.sec01.exam03
 * fileName : MyClassApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class MyClassApplication {
    public static void main(String[] args) {
        MyClass myClass = new MyClass(new Tv());

        System.out.println("---------------------------------------");

        myClass = new MyClass(new Audio());

    }
}
