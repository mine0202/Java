package chap08.sec02.exam01;

/**
 * packageName : chap08.sec02.exam01
 * fileName : KumhoTire
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class KumhoTire implements Tire{
    @Override
    public void roll() {
        System.out.println("금호타이어가 굴러갑니다.");
    }
}
