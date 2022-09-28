package chap06.sec04.exam06;

/**
 * packageName : chap06.sec04.exam06
 * fileName : CarculatorApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class CarculatorApplication {
    public static void main(String[] args) {
        Carculator carculator = new Carculator();

//         정사각형의 넓이 구하기
        double result1 = carculator.areaRectangle(10);
//         직사각형 넓이 구하기
        double result2 = carculator.areaRectangle(10,20);

        System.out.println("정사각형 넓이 : " + result1);
        System.out.println("직사각형 넓이 : " + result2);
    }
}
