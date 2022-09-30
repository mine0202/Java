package chap07.verify.exam06;

/**
 * packageName : chap07.verify.exam06
 * fileName : Report
 * author : ds
 * date : 2022-09-30
 * description : 전략클래스 (매개변수의 다형성 구현한 클래스 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class Report {
    public void drawing(Graph graph){
        graph.draw();  // 재정의된 자식 클래스의 함수가 호출
    }
}
