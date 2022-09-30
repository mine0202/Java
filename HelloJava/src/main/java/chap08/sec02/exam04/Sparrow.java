package chap08.sec02.exam04;

/**
 * packageName : chap08.sec02.exam04
 * fileName : Sparrow
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class Sparrow implements Flyable{
    @Override
    public void fly() {
        System.out.println("참새가 날고 있습니다.");
    }
}
