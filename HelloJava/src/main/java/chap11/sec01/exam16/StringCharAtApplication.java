package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam07
 * fileName : StringCharAtApplication
 * author : ds
 * date : 2022-10-05
 * description : 문자열 중에 어떤 위치에 한문자를 가져오기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class StringCharAtApplication {
    public static void main(String[] args) {
        String ssn = "010624-1230123";

//        문자열.charAt(인덱스번호) : 인덱스 번호에 해당하는 한 문자를 가져오는 함수
        char gendr = ssn.charAt(7);  // 7번째 '1' 문자가 들어감
        switch (gendr){
            case'1':
            case'3':
                System.out.println("남자입니다.");
                break;
            case '2':
            case '4':
                System.out.println("여자입니다.");
                break;
        }
    }
}
