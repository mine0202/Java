package chap11.sec01.exam16;

/**
 * packageName : chap11.sec01.exam09
 * fileName : indexOfApplication
 * author : ds
 * date : 2022-10-05
 * description : String 객체 함수 - indexOf()
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class indexOfApplication {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

//      indexOf(문자열) :  매개변수값으로 주어진 문자열이 시작되는 인덱스를 리턴하는 함수
        int location = subject.indexOf("프로그래밍"); // "프"의 위치를 반환함. 4번째이므로 3이나옴.
        System.out.println(location);

//        문자열이 없으면 -1 리턴
        if (subject.indexOf("자바") != -1){
            System.out.println("자바와 관련이 있군요");
        }
        else {
            System.out.println("자바와 관련이 없군요");
        }
    }
}
