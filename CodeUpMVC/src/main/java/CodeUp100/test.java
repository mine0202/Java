package CodeUp100;

import java.util.Scanner;

public class test {
    public void examSol01(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 이름:");
        String name = scanner.nextLine();
        System.out.print("2. 주민번호 앞 6자리:");
        int number = scanner.nextInt();
        System.out.print("3. 전화번호:");
        String phNumber = scanner.nextLine();
        System.out.println( name + "\n" + number + "\n"+ phNumber);
    }

    public void examSol02(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 이름:");
        String name = scanner.nextLine();
        System.out.print("2. 주민번호 앞 6자리:");
        int age = scanner.nextInt();
        System.out.print("3. 전화번호:");
        String phNumber = scanner.nextLine();
        System.out.println( "이름 : "+name + "\n"+"나이 : " + age + "\n"+"전화 : "+ phNumber);
    }

    public void examSol03(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        Double firstNum = scanner.nextDouble();
        System.out.print("두 번째 수 : ");
        Double secondNum = scanner.nextDouble();
        if( secondNum == 0.0 || secondNum == 0){
            System.out.println(" 결과 : 무한대");
        }
        else {
            System.out.println("결과 : "+ (firstNum/secondNum));
        }
    }

}
