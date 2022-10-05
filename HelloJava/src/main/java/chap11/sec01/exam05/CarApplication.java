package chap11.sec01.exam05;

/**
 * packageName : chap11.sec01.exam05
 * fileName : CarApplication
 * author : ds
 * date : 2022-10-05
 * description : 실행클래스, 클래스의 정보 보기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class CarApplication {
    public static void main(String[] args) {
//   Class : 자바에서 Class의 정보(패키지명, 클래스명, 경로명,등)가 있는 객체
        Class clazz = Car.class;  // 클래스 파일 이름, Car 클래스를 컴파일하면 Car.class 로 어딘가 존재함.

//        클래스의 다양한 정보 보기
        System.out.println(clazz.getPackage().getName());  // 패키지 정보 보기
        System.out.println(clazz.getName());  // 패키지명 + 클래스명 정보가 출력됨 ( 풀 클래스명 )
        System.out.println(clazz.getSimpleName()); // 패키지명 제외한 클래스명 출력됨

    }
}
