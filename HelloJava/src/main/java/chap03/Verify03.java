package chap03;

import java.util.Scanner;

/**
 * packageName : chap03
 * fileName : Verify03
 * author : ds
 * date : 2022-09-23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-23         ds          최초 생성
 */
public class Verify03 {
//    속성 생략
//    함수

    public void exam01(){
//        자바 입력 방법
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수 : ");
//        문자열을 입력고 숫자로 변경한다.
        double num1 = Double.parseDouble(scanner.nextLine());
        System.out.print("두 번째 수 : ");
        double num2 = Double.parseDouble(scanner.nextLine());
        System.out.println("-----------------------------");

//        num2 != 0 이면  " 결과 :" num1/num2
//        num2 == 0 이면 "무한대" 출력

        if ( num2 != 0.0) {
            System.out.println(" 결과 :" + (num1/num2));
        }
        else {
            System.out.println("무한대");
        }
    }

    public void exam02(){
        int var1 = 10;

        double var4 = var1 * var1 * 3.14;
//         원의 넓이를 구하세요 , 반지름 * 반지름 *3.14

        System.out.println("원의 넓이 : " + var4);
    }

    public void exam03(){
//        아이디와 패스어드를 각각 입력 받아 아이디가 "java"가 아니면
//        "로그인 실패: 아이디가 존재하지 않음"  출력
//         아이디가 "java" 이면 패스워드를 체크해서 12345 이면 "로그인성공" 출력하고
//        패수워드가 12345가 아니면 "로그인 실패: 패스워드가 틀림" 출력하세요.

        Scanner scanner =new Scanner(System.in);
        System.out.print("아이디 : ");
        String id = scanner.nextLine();
        System.out.print("패스워드 : ");
        String passWord = scanner.nextLine();


//        문자열 비교는 .equals() 를 사용함
        if ( id.equals("java")) {
//            숫자비교는 == 을 사용함.
            if ( passWord.equals("12345")) {
                System.out.println("로그인 성공");
            }
            else {
                System.out.println("로그인 실패: 패스워드가 틀림");
            }
        }
        else {
            System.out.println("로그인 실패: 아이디가 존재하지 않음");
        }
    }
}
