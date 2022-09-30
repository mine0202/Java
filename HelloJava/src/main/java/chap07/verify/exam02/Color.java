package chap07.verify.exam02;

/**
 * packageName : chap07.verify.exam02
 * fileName : Color
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class Color {
    int x;
    int y;
    public void showPoint(){
        System.out.println("("+x+","+y+")");
    }

    public void set ( int x , int y) {
        this.x = x;
        this.y = y;
    }
}
