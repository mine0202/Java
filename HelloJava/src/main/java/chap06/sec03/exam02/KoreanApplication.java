package chap06.sec03.exam02;

/**
 * packageName : chap06.sec03.exam02
 * fileName : KoreanApplication
 * author : ds
 * date : 2022-09-27
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
public class KoreanApplication {
    public static void main(String[] args) {
//        한국인 객체를 생성
//        매게변수 2개짜리 생성자를 이용해서 속성을 초기화 하세요.
//        초기화 한 결과를 출력하세요.
//        결과 :
//              k1.name : 손자바
//              k1.ssn :011225-1234567
//              k2.name : 김자바
//              k2.ssn : 880501-0654321

//        2개짜리 매개변수 생성자 호출하면서 속성 초기화
        Korean k1 = new Korean("손자바","011225-1234567");
        Korean k2 = new Korean("김자바","880501-0654321");

        System.out.println("k1.name : "+ k1.name);
        System.out.println("k1.ssn : "+ k1.ssn);
        System.out.println("k2.name : "+ k2.name);
        System.out.println("k2.ssn : "+ k2.ssn);
    }
}
