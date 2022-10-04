package chap10.sec02.exam02;

import chap10.sec01.exam03.NumberFormatApplication;

/**
 * packageName : chap10.sec02.exam02
 * fileName : TryCatch2Application
 * author : ds
 * date : 2022-10-04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class TryCatch2Application {
    public static void main(String[] args) {
        String data1= null;
        String data2= null;
        try{
//            인텔리제이 main 의 매개변수 값이 들어오지 않음
//            에러가(예외) 발생함.
            data1 = args[0];
            data2 = args[1];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("실행 매개변수 값이 부족합니다.");
//            return;
        }

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2);

            int result = value1 + value2;
            System.out.println(data1 +"+"+data2+"="+result);
        }catch (NumberFormatException e){
            System.out.println("숫자로 변환 할 수 없습니다.");
//            예외 처리와 상관 없이 무조건 실행되는 블럭
        } finally {
            System.out.println("다시 실행하세요");
        }
    }
}
