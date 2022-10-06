package chap12.sec01.exam07;

public class CalculatorApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

//        첫번째 쓰레드 setMemory 호출
        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start();  // run() 함수실행

//        두번째 쓰레드 setMemory 호출
        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start();  // run() 함수실행

    }
}
