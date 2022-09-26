package chap04;

import java.util.Scanner;

/**
 * packageName : chap04
 * fileName : Verify
 * author : ds
 * date : 2022-09-26
 * description : 종합연습 ( 반복문 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-26         ds          최초 생성
 */
public class Verify04 {
//     리팩토링 ( refactoring ) : 클래스 정리 정돈
//     클래스명 , 변수명, 함수명 등을 의미에 맞게 고치는 활동 ( 성능과 상관 없음 )
//     for 문을 이용해서 1~ 100 까지 정수 중에서 3의 배수의 총합을 구하는 코드를 작성 하세요.
    public void exam01(){
        int result = 0;
        for ( int i = 1; i<=100; i++){
            if ( i %3 == 0){
                result += i;
            }
        }
        System.out.println(result);
    }

//    반복문으로 Math.random() 함수를 이용해서 2개의 주사위를 던졌을때 나오는 눈(눈1, 눈2 ) 의 가지수를 출력하고
//    눈의 합이 5이면 실행을 멈추는 프로그램을 작성하세요
//    단, 랜덤함수 두번 써서 사용하세요
//     결과 :   ( 1, 5 )
//             ( 2, 6 )
//             .....
//             ( 1, 4 )
//            프로그램 중단.
    public void exam02(){
        while ( true) {
            int dice1 = (int)(Math.random()*6)+1;
            int dice2 = (int)(Math.random()*6)+1;
            System.out.println( "( " + dice1 + " , "+ dice2+ " )" );
            if ( dice1 + dice2 == 5){
                System.out.println("프로그램 중단");
                break;
            }
        }
    }

//    2중 for 문을 이용해서 4x + 5y  = 60 의 모든 해를 구해서 ( x,y ) 형태로 출력해보세요.
//     단, , x 와 y 는 10 이하의 자연수 ( 1~ 10 까지 for )
    public void  exam03(){
        for ( int x = 1; x <= 10 ; x++){
            for ( int y = 1; y <=10 ; y++){
                if ( (4*x) + (5*y) == 60){
                    System.out.println( "( "+x +" , "+ y+" )");
                }
            }
        }
    }

//    for문을 이용해서 다음과 같이 * 를 출력하는 코드를 작성해 보세요.
//    결과
//    *
//    **
//    ***
//    ****

    public void exam04(){
        for ( int star = 1 ; star<=4 ; star++){
            for ( int star2=1 ; star2<=star; star2++){
                System.out.print("*");
            }
//            for문 끝날때 줄바꿈이 생기게
            System.out.println("");
        }

// 다르게 코딩 하기.
        for ( int line2 = 1 ; line2<=4 ; line2++){
            for ( int star=1 ; star<=line2; star++){
                System.out.printf("%s", "*");

//                줄바꿈이 생기게 if 문을 사용
                if ( star == line2 ){
                    System.out.println();
                }
            }
        }
    }

//    for 문을 이용해서 다음과 같이 * 를 출력하는 코드를 작성해 보세요.
//    결과
//         *
//        **
//       ***
//      ****

    public void exam05(){

        for ( int line = 1 ; line<=4 ; line++){
            for( int space=4 ; space>line; space--){
                System.out.print(" ");
            }
            for ( int star=1 ; star<=line; star++){
                System.out.print("*");
            }
            System.out.println("");
        }

//         if 문을 사용하여 띄움과 * 를 입력함

        for ( int line = 1 ; line<5 ; line++){
            for( int space=4 ; space>0; space--){
                if ( line < space){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
//   while 문과 Scanner 를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를
//    작성해 보세요. 프로그램을 실행하면 다음과 같은 결과가 나와야 함
//    단, Scanner 의 nextLine() 사용하세요.
//    실행결과 : 선택> 1
//           예금액> 10000
//             선택> 2
//           출금액> 2000
//             선택> 3
//             잔고> 8000
//             선택> 4
//             프로그램 종료
    public void exam07() {
        boolean run = true;
        int balance = 0;

        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------");
            System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("------------------------------------");
            System.out.print("선택> ");

            int num1 =Integer.parseInt(scanner.nextLine());
            if (num1 == 1){
                System.out.print("예금액>");
                double input1 =Double.parseDouble(scanner.nextLine());
                balance += input1;
            }
            else if ( num1 == 2 ){
                System.out.print("출금액>");
                double output1 =Double.parseDouble(scanner.nextLine());
                balance -= output1;
            }
            else if ( num1 == 3){
                System.out.println("잔고>"+ balance);
            }
            else if ( num1 == 4) {
                break;
            }
//            if 문 대신 switch 문은 다음과 같다.
            switch( num1 ) {
                case 1:
                    System.out.print("예금액>");
                    balance +=Integer.parseInt(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -=Integer.parseInt(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("잔고>"+ balance);
                    break;
                case 4:
                    run = false;
                    break;

            }

            System.out.println();
        }
        System.out.println("프로그램 종료");
    }

}
