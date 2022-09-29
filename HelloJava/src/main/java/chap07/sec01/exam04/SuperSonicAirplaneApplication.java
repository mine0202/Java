package chap07.sec01.exam04;

/**
 * packageName : chap07.sec01.exam04
 * fileName : SuperSonicAirplaneApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class SuperSonicAirplaneApplication {
    public static void main(String[] args) {
        SuperSonicAirplane superSonicAirplane = new SuperSonicAirplane();

        superSonicAirplane.takeOff(); // 부모클래스 이륙함수
        superSonicAirplane.fly(); // 부모클래스 배행

//        공유상수 호출하는 방법 : 클래스명.공유상수명
        superSonicAirplane.flyMode = superSonicAirplane.SUPERSONIC; //비행모드 변경

        superSonicAirplane.fly();

        superSonicAirplane.land(); // 부모클래스 이륙함수
    }
}
