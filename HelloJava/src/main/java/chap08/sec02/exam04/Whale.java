package chap08.sec02.exam04;

/**
 * packageName : chap08.sec02.exam04
 * fileName : Whale
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class Whale implements Swimable{
    @Override
    public void swim() {
        System.out.println("고래가 수영하고 있습니다.");
    }
}
