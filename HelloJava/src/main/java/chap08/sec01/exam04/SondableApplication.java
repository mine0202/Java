package chap08.sec01.exam04;

/**
 * packageName : chap08.sec01.exam04
 * fileName : SondableApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class SondableApplication {
//    공유함수
    static void printSound(Soundable soundable){
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat()); // 야옹
        printSound(new Dog()); // 멍멍
    }
}
