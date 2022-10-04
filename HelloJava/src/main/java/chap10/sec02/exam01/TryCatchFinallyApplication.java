package chap10.sec02.exam01;

/**
 * packageName : chap10.sec02.exam01
 * fileName : TryCatchFinallyApplication
 * author : ds
 * date : 2022-10-04
 * description : 일반 예외 처리
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
//    예외처리 == 에러를 어떻게 처리하는가.
//    일반 예외(에러) 발생하면 콘솔에 붉은줄의 에러코드가 나타남
//    사용자 입장에서는 보기가 좋지 않음
//    예외처리를 이용해서 보다 좋은 품질의 프로그램을 만들기 위함.
//     예외발생 => 관리자가 확인중입니다. 등 메세지 전달
public class TryCatchFinallyApplication {
    public static void main(String[] args) {
        try {
//            클래스를 이름으로 찾기 : String2 없음 (자바에 없음 )
//            현재 라인에서 에러가 발생하면 catch로 가서 처리가됨.
            Class clazz = Class.forName("String2");
        } catch (ClassNotFoundException e) {
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
