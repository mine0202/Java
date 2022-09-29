package chap07.sec01.exam01;

/**
 * packageName : chap06.sec07.exam01
 * fileName : CellPhone
 * author : ds
 * date : 2022-09-29
 * description : 부모클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
//  현실 세계에서 상속 : 부모로부터 재산(자산)을 물려받는것
//  코딩에서 상속 : 부모클래스(객체)에 있는 속성, 함수 를  자식클래스(객체)에게 물려줌
//    부모클래스 == 상위클래스
//    자식클래스 == 하위클래스 == 파생클래스
//    상속의 장점 :
//          1) 코딩중복을 제거함
//          2) 부모클래스의 속성이나 함수를 수정하면 자식클래스는 자동 수정되는 효과가 있음
//             ( 유지보수성 증가, 코딩생산성 증가 )
public class CellPhone {
    String model;
    String color;

//     생성자 생략(자바 컴파일러에서 자동 생성 )

//    함수(메소드)

//    전원 켜기 함수
    void powerOn() {
        System.out.println("전원을 켭니다.");
    }
//    전원 끄기 함수 : 리턴값이 없음. void 사용
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }

//    벨을 울리는 함수
    void bell(){
        System.out.println("벨이 울립니다.");
    }

//    핸드폰에 통화하기 기능(함수) : 매개변수 있는 함수
    void sendVoice(String message){
        System.out.println("나 : "+message);
    }

//    핸드폰 받는 사람 통화하는 함수
    void receiveVoice(String message){
        System.out.println("상대방 : "+ message);
    }

//    전화 끊기 함수
    void hangup(){
        System.out.println("전화를 끊습니다.");
    }
}
