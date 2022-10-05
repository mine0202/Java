package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam20
 * fileName : MathApplication
 * author : ds
 * date : 2022-10-05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class MathApplication {
    public static void main(String[] args) {
//        절대값 구하기  Math.abs(숫자)
        int v1 = Math.abs(-5);        // 5
        double v2 = Math.abs(-3.14);  // 3.14
        System.out.println(v1);
        System.out.println(v2);

//        올림 함수
        double v3 = Math.ceil(5.3);   // 6
        double v4 = Math.ceil(-5.3);  // -5
        System.out.println(v3);
        System.out.println(v4);

//        내림 함수
        double v5 = Math.floor(5.3);   // 5
        double v6 = Math.floor(-5.3);  // -6
        System.out.println(v5);
        System.out.println(v6);

//      두 수의 최대값 구하기
        int v7 = Math.max(5,9);            // 9
        double v8 = Math.max(5.3 , 2.5);   // 5.3
        System.out.println(v7);
        System.out.println(v8);

//      두 수의 최소값 구하기
        int v9 = Math.min(5,9);             // 5
        double v10 = Math.min(5.3 , 2.5);   // 2.5
        System.out.println(v9);
        System.out.println(v10);

//        Math.random() : 랜덤 함수
        double v11 = Math.random();  // 0과 1사이의 실수가 랜덤으로 나옴
        System.out.println(v11);

//        실수 반올림
        long v12 = Math.round(5.3);  // 5
        long v13 = Math.round(5.7);  // 6
        System.out.println(v12);
        System.out.println(v13);

//         셋째
        double value = 12.3456; // 셋째자리 반올림 12.35
        double temp = value * 100;
        long temp2 = Math.round(temp);
        double value2 = (double) temp2/100.0;
        System.out.println(value2);

    }
}
