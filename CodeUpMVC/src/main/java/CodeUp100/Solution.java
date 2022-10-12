package CodeUp100;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public void examSol01() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 이름:");
        String name = scanner.nextLine();
        System.out.print("2. 주민번호 앞 6자리:");
        String number = scanner.nextLine();
        System.out.print("3. 전화번호:");
        String phNumber = scanner.nextLine();
        System.out.println(name + "\n" + number + "\n" + phNumber);
    }

    public void examSol02() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. 이름:");
        String name = scanner.nextLine();
        System.out.print("2. 나이:");
        String age = scanner.nextLine();
        System.out.print("3. 전화번호:");
        String phNumber = scanner.nextLine();
        System.out.println("이름 : " + name + "\n" + "나이 : " + age + "\n" + "전화 : " + phNumber);
    }

    public void examSol03() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 수 : ");
        Double firstNum = scanner.nextDouble();
        System.out.print("두 번째 수 : ");
        Double secondNum = scanner.nextDouble();
        if (secondNum == 0.0 || secondNum == 0) {
            System.out.println(" 결과 : 무한대");
        } else {
            System.out.println("결과 : " + (firstNum / secondNum));
        }
    }

    public void examSol04(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("아이디: ");
        String id = scanner.nextLine();
        System.out.print("패스워드: ");
        int password = scanner.nextInt();
        if( id.equals("java") && password == 12345){
            System.out.println("로그인 성공");
        }
        else {
            System.out.println("로그인 실패");
        }
    }


    public void examSol05() {
        int result=0;
        for (int i = 1; i < 101; i++) {
            if ( i%3==0){
                result += i;
            }
        }
        System.out.println("3의 배수의 합: "+result);
    }

    public void examSol06() {
        String result="";
        for (int i = 1; i < 5; i++) {
            String star = new String(new char[i]).replace("\0", "*");
            result += star +"\n";
        }
        System.out.println(result);
    }

    public void examSol07() {
        int[] arr = {1,5,3,8,2};
        System.out.println("max:"+ Arrays.stream(arr).max().getAsInt());
    }

    public void examSol08() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("괄호 : ");
        String blank = scanner.nextLine();
        int firstBlank =0;
        int secondBlank =0;
        for (int i = 0; i < blank.length(); i++) {
            String strr =String.valueOf(blank.charAt(i));
            if (strr.equals("(")){
                firstBlank ++;
            }
            else if ( strr.equals(")")){
                secondBlank ++;
            }
        }
        System.out.println(firstBlank + " "+ secondBlank);
    }


    public void examSol09(){
        String firstResult ="";
        String secondResult ="";
        Scanner scanner = new Scanner(System.in);
        System.out.print("평문: ");
        char[] text = scanner.next().toCharArray();
        for (int i = 0; i < text.length; i++) {
            int first = text[i];
            firstResult += (char) (first +2);
            secondResult += (char) ((first *7)%80+48);
        }
        System.out.println(firstResult + "\n"+ secondResult);

    }

    public void examSol10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문장: ");
        String result = scanner.nextLine();
        String[] sarr = result.split(" ");
        String word = "love";
        int len = sarr.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (word.equals(sarr[i])) {
                count++;
            }
        }
        System.out.println(count);
    }
}
