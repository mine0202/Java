package chap06.sec05.exam04;

/**
 * packageName : chap06.sec05.exam04
 * fileName : Singleton
 * author : ds
 * date : 2022-09-28
 * description : 디자인 패턴 1 가지 ( 싱글톤 )
 * 목적 :  공유 객체 ( 객체의 상태를 공유하기 위한 목적 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Singleton {
//    첫번째로 객체를 공유하기 때문에  다른 객체에서 생성을 못하게 막아야 함
    private static Singleton singleton = new Singleton();  // 최초 한번 객체 생성됨.

//    다른 객체에서 생성을 막는 방법 : 접근제어자(private ) 로 설정하여 내꺼만 사용가능.
    private Singleton() {

    }
//    다른 객체에서는 이미 만들어진 객체를 공유해서 사용가능.
    static Singleton getInstance(){
        return singleton;
    }
}
