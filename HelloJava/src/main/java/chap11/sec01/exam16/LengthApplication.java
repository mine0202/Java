package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam10
 * fileName : LengthApplication
 * author : ds
 * date : 2022-10-05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class LengthApplication {
    public static void main(String[] args) {
        String ssn = "1306241230123";
        int length = ssn.length();  // 문자열 길이 리턴

        System.out.println(length);
        if ( length == 13){
            System.out.println("맞는 자리수 입니다.");
        }
        else {
            System.out.println("자리수가 틀립니다.");
        }
    }
}
