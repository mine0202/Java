package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : Airplane
 * author : ds
 * date : 2022-09-29
 * description : 부모클래스의 함수 호출 ( super.함수() )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Airplane {
    //    비행기 착륙함수
    public void land() {
        System.out.println("착륙 합니다.");
    }

    //    이륙함수
    public void takeOff() {
        System.out.println("이륙 합니다.");
    }

    //    비행함수
    public void fly() {
        System.out.println("일반 비행 합니다.");
    }
}

