package chap06.sec04.exam02;

/**
 * packageName : chap06.sec04.exam02
 * fileName : ComputerApplication
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
        Computer computer = new Computer();
//        배열 정의
        int[] value1 = {1,2,3};
//        return 값이 있는 함수
        int result1 = computer.sum1(value1);
        System.out.println("result1 : "+ result1);

        int[] value2 = new int[]{1,2,3,4,5};
//         리턴 값이 있는 함수
        int result2 = computer.sum1(value2);
        System.out.println("result2 : "+ result2);

        int[] value3 = { 1,2,3,4};
        int result3 = computer.muti(value3);
        System.out.println("result3 : "+ result3);

        //    새로운 ... 함수 호출하기
        int result4 = computer.sum2(1,2,3);
        System.out.println("result4 : "+ result4);

        int result5 = computer.sum2(1,2,3,4,5);
        System.out.println("result5 : "+ result5);

    }
}
