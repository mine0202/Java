package chap08.sec01.exam02;

/**
 * packageName : chap08.sec01.exam02
 * fileName : SmartTelevisionApplication
 * author : ds
 * date : 2022-09-30
 * description : 실행 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class SmartTelevisionApplication {
    public static void main(String[] args) {
        SmartTelevision smartTelevision = new SmartTelevision();

        RemoteControl rc = smartTelevision;
        Searchable searchable = smartTelevision;

//        스마트 티비 이용하기
        rc.turnOn();
        rc.setVolumn(7);
        searchable.search("www.naver.com");
        rc.turnOff();
    }
}
