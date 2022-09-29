package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : Car
 * author : ds
 * date : 2022-09-29
 * description : 자동차 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Car {

    //필드 == 속성 == 멤버변수

    Tire frontLeftTire = new Tire("앞왼쪽", 6);
    Tire frontRightTire = new Tire("앞오른쪽", 2);
    Tire backLeftTire = new Tire("뒤왼쪽", 3);
    Tire backRightTire = new Tire("뒤오른쪽", 4);

    //생성자

    //메소드
    int run() {
//        .roll() 함수 호출 : 리턴값이 false 이면 타이어 펑크
//         어떤 타이어가 펑크났는지 알기위해서 리턴. 1,2,3,4
        System.out.println("[자동차가 달립니다.]");
        if(frontLeftTire.roll()==false) { stop(); return 1; };
        if(frontRightTire.roll()==false) { stop(); return 2; };
        if(backLeftTire.roll()==false) { stop(); return 3; };
        if(backRightTire.roll()==false) { stop(); return 4; };
        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}
