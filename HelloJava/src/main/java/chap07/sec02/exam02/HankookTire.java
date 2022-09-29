package chap07.sec02.exam02;

/**
 * packageName : chap07.sec02.exam02
 * fileName : HankookTire
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class HankookTire extends Tire{

//    생성자
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

//    재정의함수
    @Override
    public boolean roll() {
//        재정의 : 타이어 이름을 한국타이어로 변경
        ++accumulatedRotation;
        if(accumulatedRotation<maxRotation) {
            System.out.println(location + " HankookTire 수명: " + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + " HankookTire 펑크 ***");
            return false;
        }
    }
}
