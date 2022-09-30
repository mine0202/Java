package chap08.sec01.exam02;

/**
 * packageName : chap08.sec01.exam02
 * fileName : SmartTelevision
 * author : ds
 * date : 2022-09-30
 * description : 검색기능이 있는 텔레비젼
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 상속은 두개를 받을수 없음
//    인터페이스는 두개이상 implements 가능함.
public class SmartTelevision implements RemoteControl, Searchable{
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

    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }
}
