package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : CarApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */

// 문제 : 아래 결과를 보고 HankookTire , KumhoTire  클래스를 만드세요
//    결과 :
//    한국타이어가 굴러갑니다
//    한국타이어가 굴러갑니다
//    한국타이어가 굴러갑니다
//    한국타이어가 굴러갑니다
//    금호타이어가 굴러갑니다.
//    금호타이어가 굴러갑니다.
//    한국타이어가 굴러갑니다.
//    한국타이어가 굴러갑니다.
public class CarApplication {
    public static void main(String[] args) {
        Car car = new Car();

//        기본적으로 한국타이어 객체가 사용됨
        car.run();

//        금호타이어로 교체
        car.frontLeftTire = new KumhoTire();
        car.frontRightTire = new KumhoTire();
        car.run();
    }
}
