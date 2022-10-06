package chap12.sec01.exam04;

/**
 * packageName : chap12.sec01.exam04
 * fileName : BeefThreadApplication
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
// 상속받은 쓰레드 실행하기

public class BeefThreadApplication {
    public static void main(String[] args) {
//        다형성  부모클래스 객체변수 = new 자식클래스의 생성자();
        Thread thread = new BeefThread();

        thread.start(); // run() 함수 실행

//        다른 작업 , 화면에 출력
        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try{
                Thread.sleep(500);
            }catch (Exception e){}
        }
    }
}
