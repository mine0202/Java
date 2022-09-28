package chap06.sec04.exam03;

/**
 * packageName : chap06.sec04.exam03
 * fileName : Car
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */

// gas 를 체크해서 차가 출발을 합니다.
//    gas 가 있으면 "출발합니다." 출력하고
//    .run() 실행 // gas--;  ( gas감소시킴 반복문 종료 )
//    다시 gas 가 있는지 확인해서  gas>0 이면 "gas를 주입할 필요가 없습니다." 출력
//    아니면 "gas 를 주입하세요" 출력
public class Car {
    int gas;

//    gas 의 속성을 저장하는 함수
    void setGas(int gas) {
        this.gas = gas;
    }
//    문제 1.
    boolean isLeftGas(){
//        gas == 0 이면 "gas 가 없습니다." return false
//        아니면 "gas 가 있습니다." return true

        if ( gas == 0 ) {
            System.out.println("gas 가 없습니다.");
            return false;
        }
        else {
            System.out.println("gas 가 있습니다.");
            return true;
        }
    }

    void run(){
        while(true){
//             조건문 체크 : gas > 0 " 달립니다. ( gas 잔량 : 5 )" 출력 gas --;
//                         아니면   " 멈춥니다. (gas 잔량 : 0 ) " 출력 반복문 종료.
            if ( gas >0 ) {
                System.out.println("달립니다. ( gas 잔량 : "+ gas + " )");
                gas --;
            }
            else {
                System.out.println("멈춥니다.  ( gas 잔량 : "+ gas + " )");
                break;
//                return 을 사용해도됨. (함수를 중단하고 결과를 밖으로 끄집어 내는 명령어)
            }

        }
    }

}
