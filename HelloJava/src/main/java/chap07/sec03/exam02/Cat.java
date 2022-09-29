package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : Cat
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Cat extends Animal {
    public Cat() {
        this.kind = " 포유류";
    }

//   추상함수 구현(재정의), 메서드 구현이라고 표현함
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
