package chap10.sec01.exam01;

/**
 * packageName : chap10.sec01.exam01
 * fileName : NullApplication
 * author : ds
 * date : 2022-10-04
 * description : null pointer exception ( 널 예외 처리 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */

//예외 == 에러
//    예외처리 == 에러처리 잘하는 방법을 배우는 것
public class NullApplication {
    public static void main(String[] args) {
        String data = "";
//        변수 값이 null 이면 속성이나 함수를 부를 수 없음
        System.out.println(data.toString());  // 에러 발생
    }
}
