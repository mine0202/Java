package chap10.sec01.exam02;

/**
 * packageName : chap10.sec01.exam02
 * fileName : OutOfBoundApplication
 * author : ds
 * date : 2022-10-04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class OutOfBoundApplication {
    public static void main(String[] args) {
//       배열에는 아무것도 없는데 args의 첫번째 두번째를 부르고 있다...에러발생
        String data1 = args[0];
        String data2 = args[1];
        System.out.println(data1);
        System.out.println(data2);
    }
}
