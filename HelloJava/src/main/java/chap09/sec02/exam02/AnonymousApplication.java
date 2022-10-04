package chap09.sec02.exam02;

/**
 * packageName : chap09.sec02.exam02
 * fileName : AnonymousApplication
 * author : ds
 * date : 2022-10-04
 * description : 실행클래스 + 매개변수 이용한 익명객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class AnonymousApplication {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();

        anonymous.field.turnOn();
        anonymous.field.turnOff();

        anonymous.method1();

        anonymous.method2(new RemoteControl() {
                  @Override
                  public void turnOn() {
                      System.out.println("스마트 티비를 켭니다.");
                  }

                  @Override
                  public void turnOff() {
                      System.out.println("스마트 티비를 끕니다.");
                  }
              }
        );
    }
}
