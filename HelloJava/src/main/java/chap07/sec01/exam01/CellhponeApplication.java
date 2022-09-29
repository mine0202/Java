package chap07.sec01.exam01;

/**
 * packageName : chap06.sec07.exam01
 * fileName : CellhponeApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class CellhponeApplication {
    public static void main(String[] args) {
//        Dmb 탑재 핸드폰 객체
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바", "검정",10);

//        상속받은 속성 출력하기
        System.out.println("모델 : " + dmbCellPhone.model); // 부모속성 : model
        System.out.println("색상 : " + dmbCellPhone.color); // 부모속성 : color

        System.out.println("채널 : " + dmbCellPhone.channel); // 자기 자신 속성 : channel

//        상속받은 함수 실행하기
        dmbCellPhone.powerOn(); // 부모함수
        dmbCellPhone.bell();  // 부모함수
        dmbCellPhone.sendVoice("여보세요"); // 부모함수 : 전화받기
        dmbCellPhone.receiveVoice("안녕하세요. 반갑습니다.");  // 부모함수 : 상대방
        dmbCellPhone.hangup();  // 부모함수 : 전화 끊기

//        자기꺼 함수 실행하기
        dmbCellPhone.turnOnDmb(); // 자기함수 실행 : dmb 켜기
        dmbCellPhone.changeChannelDmb(12);  // 자기함수 실행 : 채널 바꾸기
        dmbCellPhone.turnOffDmb(); // 자기함수 : tv 끄기
    }
}
