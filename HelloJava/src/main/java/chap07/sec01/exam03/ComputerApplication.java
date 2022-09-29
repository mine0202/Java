package chap07.sec01.exam03;

/**
 * packageName : chap07.sec01.exam03
 * fileName : ComputerApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class ComputerApplication {
    public static void main(String[] args) {
        Calcuator calcuator = new Calcuator();

        System.out.println("부모클래스 원의 면적 : " + calcuator.areaCirecle(10));

        Computer computer = new Computer();

        System.out.println("자식클래스 원의 면적 : " + computer.areaCirecle(10));
    }
}
