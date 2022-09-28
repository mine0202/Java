package chap06.sec04.verify.exam04;

/**
 * packageName : chap06.sec04.verify.exam04
 * fileName : Printer
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Printer {
//    static 공유함수 ( == 전역함수 == 정적함수 )
    static void println( int value){
        System.out.println("공유함수 (int) : " + value);
    }
    static void println( boolean value){
        System.out.println("공유함수 (boolean) : " + value);
    }
    static void println( double value){
        System.out.println("공유함수 (double) : " + value);
    }
    static void println( String value){
        System.out.println("공유함수 (String) : " + value);
    }
}
