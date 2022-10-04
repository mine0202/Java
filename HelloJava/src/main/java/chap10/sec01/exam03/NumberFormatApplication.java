package chap10.sec01.exam03;

/**
 * packageName : chap10.sec01.exam03
 * fileName : NumberFormatApplication
 * author : ds
 * date : 2022-10-04
 * description : 숫자형태가 잘못될 경우 발생
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class NumberFormatApplication {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2);

        int result = value1 + value2;
        System.out.println(data1 +"+"+data2+"="+result);
    }
}
