package chap08.sec02.exam06;

/**
 * packageName : chap08.sec02.exam06
 * fileName : CalcuatorApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
//결과
//    15
//    5
//    50
//    2
//    --- 0으로 나누기 테스트 ---
//    -999999999
//
//    간단한 사칙연산 계산기 입니다.
public class CalcuatorApplication {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        System.out.println(calc.add(10, 5));
        System.out.println(calc.substract(10, 5));
        System.out.println(calc.times(10, 5));
        System.out.println(calc.divide(10, 5));

        System.out.println("--- 0으로 나누기 테스트 ---");
        System.out.println(calc.divide(10, 0));

        System.out.println(); // 한 줄 띄우기

        calc.showInfo();
    }

}
