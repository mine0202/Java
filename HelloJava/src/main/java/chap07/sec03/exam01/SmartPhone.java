package chap07.sec03.exam01;

/**
 * packageName : chap07.sec03.exam01
 * fileName : SmartPhone
 * author : ds
 * date : 2022-09-29
 * description : 자식클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class SmartPhone extends Phone {

    public SmartPhone(String owner) {
        super(owner);
    }

//     인터넷 검색함수
    public void internetSearch(){
        System.out.println("인터넷 검색을 합니다.");
    }

}
