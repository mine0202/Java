package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam16
 * fileName : TrimApplication
 * author : ds
 * date : 2022-10-05
 * description : 문자열 앞/뒤 공백 없애기 함수, .trim()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class TrimApplication {
    public static void main(String[] args) {
        String tel = "   02";
        String tel1 = "123   ";
        String tel2 = "   12 34   ";

// trim() 문자열 앞/뒤 공백 없애기,  문자열 중간 공백은 제거 안됨.
        String telsum1 = tel + tel1 + tel2;
        String telsum2 = tel.trim()+tel1.trim()+tel2.trim();

        System.out.println(telsum1);
        System.out.println(telsum2);
    }
}
