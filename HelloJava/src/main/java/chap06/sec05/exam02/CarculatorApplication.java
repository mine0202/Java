package chap06.sec05.exam02;

import javax.xml.bind.annotation.XmlAnyAttribute;

/**
 * packageName : chap06.sec05.exam02
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
        double result1 = 10*10*Calculator.pi; // pi = 3.14 공유변수
        int result2 = Calculator.plus(10,5);  // 공유함수
        int result3 = Calculator.minus(10,5);  // 공유함수

        System.out.println("result1 : "+ result1);
        System.out.println("result2 : "+ result2);
        System.out.println("result3 : "+ result3);

    }
}
