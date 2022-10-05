package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam16
 * fileName : BoxingApplication
 * author : ds
 * date : 2022-10-05
 * description : Wrapper(포장, 랩) Class , Boxing / UnBoxing ( 박스포장, 박스뜯기) 예제
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class BoxingApplication {
    public static void main(String[] args) {
//        기본 자료형 : byte, short , long . float, double, char, boolean
//        위의 자료형을 객체로 변환해야 할 때가 있음

//        int  -> Integer 객체
//        double -> Double 객체
//        boolean -> Boolean 객체
//        기본 자료형을 객체로 변환한 것을 Boxing 이라고 함.
        Integer obj1 = new Integer(100);  // 객체정수형(Wrapper Class), 정수 100 이 Integer 라는 객체로 변환
        Integer obj2 = 100;  // 객체정수형(Wrapper Class), 정수 100 이 Integer 라는 객체로 변환

//        객체를 기본자료형으로 변환한 것을 UnBoxing 이라고함
        int value1 = obj1.intValue(); // 원복 , 옛날방식
        int value2 = obj2; // 자동변환 ( 객체 에서 기본자료형으로 ) 원복 , 요즘방식

        System.out.println(value1);
        System.out.println(value2);
    }
}
