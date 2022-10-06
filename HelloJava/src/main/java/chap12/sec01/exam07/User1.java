package chap12.sec01.exam07;

/**
 * packageName : chap12.sec01.exam07
 * fileName : User1
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
// 작업쓰레드 1 ( 상속받아 만듬 )
public class User1 extends Thread{
    private Calculator calculator;

    //    setter
    public void setCalculator(Calculator calculator) {

        this.setName("User1");  // 쓰레드 이름 부여
        this.calculator = calculator;
    }

//    run() 실행함수
    public void run(){
        calculator.setMemory(50);  // calculator 객체의 setter 호출
    }
}
