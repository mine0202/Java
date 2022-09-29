package chap07.sec02.exam03;

/**
 * packageName : chap07.sec02.exam03
 * fileName : Bus
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Bus extends Vehicle{
    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
