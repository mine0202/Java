package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : Phone
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */

// 추상 클래스는 객체생성을 못함. ( new Phone()  에러발생)
public abstract class Phone {
    public String owner;

//    생성자
    public Phone(String owner) {
        this.owner = owner;
    }

//    전원 키는 함수
    public void turnOn(){
        System.out.println("Phone 전원을 켭니다.");
    }

    public void  turnOff(){
        System.out.println("Phone 전원을 끕니다.");
    }

}
