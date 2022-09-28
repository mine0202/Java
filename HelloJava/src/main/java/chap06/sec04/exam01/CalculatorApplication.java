package chap06.sec04.exam01;

/**
 * packageName : chap06.sec04.exam01
 * fileName : CalculatorApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        계산기 전원 on
//         객체변수.리턴값이 없는 함수 ();
        calculator.powerOn();
//        덧셈 계산
//        int result = 객체변수.리턴값이 있는 함수();
        int result1 = calculator.plus(5,6);
        System.out.println("result1 : " + result1);

        byte x = 4;
        byte y = 3;
//        위에서 변수의 값을 byte형을 넣었지만 byte 는 int 로 자동 형변환됨.
        double result2 = calculator.divide(4, 3);
        System.out.println("result2 : "+result2);

//        리턴이 없는 함수는 그냥 객체변수.함수명()으로 호출하면 됨.
        calculator.powerOff();

    }
}
