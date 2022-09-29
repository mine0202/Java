package chap07.sec01.exam01;

/**
 * packageName : chap06.sec07.exam01
 * fileName : DmbCellPhone
 * author : ds
 * date : 2022-09-29
 * description : 자식클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */

//  사용법 :  public class 자식클래스명 extends 부모클래스 {  }
public class DmbCellPhone extends CellPhone {
//    String model , String color 속성 상속받으므로 정의할 필요없음
    int channel;  // tv채널 속성

//    부모클래스에 있어서 속성에서도 입력가능.
    public DmbCellPhone(String model , String color, int channel) {
        this.channel = channel;
        this.model = model; // 부모속성 = 매개변수값
        this.color = color; // 부모속성 = 매개변수값
    }

    //    핸드폰의 기본기능은 부모로부터 상속받음.
//    powerOn() , powerOff() , bell() 등 상속받았으므로 정의할 필요없음

//    tv 수신을 시작하는 함수
    void turnOnDmb(){
        System.out.println("채널 : "+ channel + "번 방송 수신을 시작합니다.");
    }

//    채널 돌리기 함수
    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("채널 : "+ channel + "번으로 바꿉니다.");
    }

//    tv 수신을 멈추는 함수
    void turnOffDmb(){
        System.out.println("DMB 방송 수신을 멈춥니다.");
    }
}

