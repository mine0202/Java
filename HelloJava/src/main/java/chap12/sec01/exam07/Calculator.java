package chap12.sec01.exam07;

/**
 * packageName : chap12.sec01.exam07
 * fileName : Calculator
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */

//공유객체 ( 2개의 쓰레드에서 공유함수 호출 )
public class Calculator {
    private int memory;


//    getter : 속성의 값을 조회하는 함수
    public int getMemory() {
        return memory;
    }

//    setter : 속성에 값을 저장하는 함수
//    각각의 쓰레드에서 호출하는 함수
    synchronized public void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(1000); //1초지연
        }catch (Exception e){}

//        Thread.currentThread().getName() : 현재실행되는 쓰레드의 이름 가져오기
        System.out.println(Thread.currentThread().getName() + " : "+ this.memory);
    }
}
