package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : StockGraphApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
//문제  : 다형성 예제 + 상속
//      아래 소스를 보고 Graph 와 StockGraph 클래스를 완성하세요
//    결과:
//    주가변경 추이를 그립니다.
//    기본 그래프를 그립니다.

//    디자인 패턴 : 전략패턴(Strategy Pattern). 전략클래스를 이용해서 공유함수 다형성을 사용함.
public class StockGraphApplication {
    public static void main(String[] args) {
        StockGraph stockGraph = new StockGraph();
        Graph graph = new Graph();

        Report r = new Report();
        r.drawing(stockGraph);  // "주가변경 추이를 그립니다."
        r.drawing(graph); // "기본 그래프를 그립니다."
    }
}
