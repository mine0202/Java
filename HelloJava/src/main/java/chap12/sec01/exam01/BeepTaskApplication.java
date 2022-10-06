package chap12.sec01.exam01;

/**
 * packageName : chap12.sec01.exam01
 * fileName : BeepTaskApplication
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
//메인쓰레드 / 작업쓰레드 동시 실행
//    작업쓰레드(Runnable 인터페이스 구현한 클래스) 를 만들어서 실행
public class BeepTaskApplication {
//    main 함수 내부적으로 쓰레드로 동작함
    public static void main(String[] args) {
//         다형성.  Runnable 인터페이스 변수  = new 구현클래스()
        Runnable runnable = new BeepTask();
        Thread thread = new Thread(runnable);  // 매개변수로 작업쓰레드를 넘김
        thread.start(); // 작업쓰레드의 run() 함수가 실행됨

        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){

            }
        }
    }
}
