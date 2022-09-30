package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : StockGraph
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class StockGraph extends Graph{
    @Override
    void draw() {
        System.out.println("주가변경 추이를 그립니다.");
    }
}
