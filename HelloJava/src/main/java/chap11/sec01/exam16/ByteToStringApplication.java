package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam06
 * fileName : ByteToStringApplication
 * author : ds
 * date : 2022-10-05
 * description :  바이트 배열 -> 문자열 배열로 변환하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class ByteToStringApplication {
    public static void main(String[] args) {
        byte[] bytes ={72,101,108,108,111,32,74,97,118,97};

//        byte 배열을 문자열로 변환하기
//        String 생성자의 매개변수 = byte[]
        String str1 = new String(bytes);
        System.out.println(str1);

//        참고) 인덱스 위치부터 length 만큼만 잘라서 보여주기
//        사용법 : String(byte배열, 인덱스위치, 보고싶은문자열길이)
        String str2 = new String(bytes,6,4);
        System.out.println(str2);
    }
}
