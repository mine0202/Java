package chap07.sec01.exam02;

/**
 * packageName : chap07.sec07.exam02
 * fileName : People ( 부모클래스 )
 * author : ds
 * date : 2022-09-29
 * description : super 예제
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class People {
    // 속성
    public String name;
    public String ssn;

// 생성자
    public People(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }
}
