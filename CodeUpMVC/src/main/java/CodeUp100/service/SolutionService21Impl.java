package CodeUp100.service;


import CodeUp100.model.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// 구현 클래스 - 업무로직 함수들 모임
public class SolutionService21Impl implements SolutionService{

//    1021 : [기초-입출력] 단어 1개 입력받아 그대로 출력하기
    @Override
    public Solution CodeUp1001(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
        solution.setStrResult(scanner.nextLine());
        return solution;
    }

    @Override
    public Solution CodeUp1002(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문장을 입력하세요");
        solution.setStrResult(scanner.nextLine());
        return solution;
    }

//    1023 : [기초-입출력] 실수 1개 입력받아 부분별로 출력하기
    @Override
    public Solution CodeUp1003(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요");
        String[] strIput = scanner.nextLine().split("\\.");
        String firstResult = strIput[0];
        String secondResult = "";
        for (int i = 1; i < strIput.length; i++) {
            secondResult += strIput[i]+"";
        }
        solution.setStrResult(firstResult+"\n"+secondResult);
        return solution;
    }

// 1024 : [기초-입출력] 단어 1개 입력받아 나누어 출력하기
    @Override
    public Solution CodeUp1004(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("단어를 입력하세요");
        String str = scanner.nextLine();
        String result ="";
        for (int i = 0; i <str.length() ; i++) {
           result += "'"+str.charAt(i)+"'" + "\n";
        }
        solution.setStrResult(result);
        return solution;
    }


// 1025 : [기초-입출력] 정수 1개 입력받아 나누어 출력하기
    @Override
    public Solution CodeUp1005(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        String strr = scanner.nextLine();
        String result ="";
        for (int i  = 0; i < strr.length() ; i++) {
            int j = 0;
            j = strr.length() - i - 1;
            String zero = new String(new char[j]).replace("\0", "0");
            result += "["+strr.charAt(i)+zero+"]"+"\n";
        }
        solution.setStrResult(result);
        return solution;
    }


    @Override
    public Solution CodeUp1006(Solution solution) {

        return solution;
    }

    @Override
    public Solution CodeUp1007(Solution solution) {

        return solution;
    }

    @Override
    public Solution CodeUp1008(Solution solution) {

        return solution;
    }

    @Override
    public Solution CodeUp1009(Solution solution) {
        return solution;
    }
    
    @Override
    public Solution CodeUp1010(Solution solution) {

        return solution;
    }
}
