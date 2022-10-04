package chap10.sec02.exam04;

/**
 * packageName : chap10.sec02.exam04
 * fileName : ThrowsApplication
 * author : ds
 * date : 2022-10-04
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class ThrowsApplication {
    public static void main(String[] args) {
//        throws 가 붙은 함수를 호출할 경우 반드시 예외처리해야함.
        try{
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }

//    공유함수
//    throws : 함수의 끝에 붙는 키워드로 자신을 호출하는 쪽에서 try~catch 예외처리를 하라고 떠넘기기
    public static void findClass() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.String2");
    }

}
