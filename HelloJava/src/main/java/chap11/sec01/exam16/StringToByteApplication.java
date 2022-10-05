package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam08
 * fileName : StringToByteApplication
 * author : ds
 * date : 2022-10-05
 * description : 문자열(String) 을 바이트(byte[]) 배열로 변환
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class StringToByteApplication {
    public static void main(String[] args) {
        String str = "안녕하세요";

//       문자열.getBytes()  : 문자열을 byte[] 배열로 변환
        byte[] bytes = str.getBytes();
//       15글자. UTF-8(언어셋) 한글 3byte 이므로 5글자여서 15나옴.
        System.out.println("bytes.length : " + bytes.length);
//       옛날 언어셋 EUC-KR. KSC5601,MS949 등.. -> UTF-8

//       byte[] 를 문자열 원복.
        String str2 = new String(bytes);
        System.out.println(str2);

//        언어셋 UTF-8 아닐경우 변환방법 : (예외처리 필요 ) try ~ catch 필요
//        UTF8 , UTF-8  : 같은 UTF-8(표준) 임.
//        문자열을 byte[] UTF-8 로 변환
//        byte[] 을 UTF-8 문자열로 변환

        try{
            byte[] bytes2 = str.getBytes("UTF-8");
            System.out.println("bytes.length : " + bytes.length);
            String str3 = new String(bytes,"UTF-8");
            System.out.println(str3);
        }catch (Exception e){
            System.out.println("에러입니다.");
        }
    }
}
