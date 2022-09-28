package chap06.sec05.exam02;

/**
 * packageName : chap06.sec05.exam02
 * fileName : Calculator
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Calculator {
//    공유 == 전역 == 정적 변수
    static double pi = 3.14;

    static int plus(int x , int y){
        return x+y;
    }

    static  int minus(int x, int y){
        return x-y;
    }

}
