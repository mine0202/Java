package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam17
 * fileName : SubStringApplication
 * author : ds
 * date : 2022-10-05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class SubStringApplication {
    public static void main(String[] args) {
        String ssn = "987654-1234567";

        String firstNum = ssn.substring(0,6);  // 인덱스번호 0과 6 사이 문자 자르기
        System.out.println(firstNum);

//        사용법 : 문자열.substring(시작인텍스, 끝인덱스);

        String secondNum = ssn.substring(7);  //  인덱스번호 7 부터 끝까지 문자 자르기
        System.out.println(secondNum);
    }
}
