package chap08.sec01.exam03;

/**
 * packageName : chap08.sec01.exam03
 * fileName : MyClass
 * author : ds
 * date : 2022-09-30
 * description : 내 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class MyClass {
    RemoteControl remoteControl;

    public MyClass(RemoteControl remoteControl) {
        this.remoteControl = remoteControl;
//        리모콘 켜기
        remoteControl.turnOn();
//        볼륨조절 기능
        remoteControl.setVolumn(5);
    }
}
