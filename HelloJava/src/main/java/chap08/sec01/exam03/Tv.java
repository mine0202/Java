package chap08.sec01.exam03;

/**
 * packageName : chap08
 * fileName : Tv
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class Tv implements RemoteControl {
    private int volumn;

    @Override
    public void turnOn() {
        System.out.println("티비를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("티비를 끕니다.");
    }

    @Override
    public void setVolumn(int volumn) {
        this.volumn = volumn;
        if ( volumn > MAX_VOLUMN){
            this.volumn = MAX_VOLUMN;
            System.out.println("최대 볼륨은 "+ MAX_VOLUMN+"입니다.");
        }
        else if ( volumn < MIN_VOLUMN){
            this.volumn = MIN_VOLUMN;
            System.out.println("최소 볼륨은 "+ MIN_VOLUMN+"입니다.");
        }
        System.out.println("현재 티비 볼륨 :"+ this.volumn);
    }
}
