package CodeUp100.service;


import CodeUp100.model.Solution;

import java.util.Scanner;


// 구현 클래스 - 업무로직 함수들 모임
public class SolutionService31Impl implements SolutionService{

//    1031 : [기초-출력변환] 10진 정수 1개 입력받아 8진수로 출력하기
    @Override
    public Solution CodeUp1001(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10진수 정수를 입력하세요");
        int tenNum = scanner.nextInt();
        String strNum = String.format("%o",scanner.nextInt()); // %o 8진수
        solution.setStrResult(Integer.toOctalString(tenNum));
        return solution;
    }

//1032 : [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기1
    @Override
    public Solution CodeUp1002(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10진수 정수를 입력하세요");
        int tenNum = scanner.nextInt();
        solution.setStrResult(Integer.toHexString(tenNum));
        return solution;
    }

//    1033 : [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기2
    @Override
    public Solution CodeUp1003(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10진수 정수를 입력하세요");
//        int tenNum = scanner.nextInt();
//        solution.setStrResult(Integer.toHexString(tenNum).toUpperCase());
        // 대문자X 를 사용하면 대문자로 표시, 소문자x 를 사용하면 소문자로 표시
        String strr = String.format("%X",scanner.nextInt());
        solution.setStrResult(strr);

        return solution;
    }

// 1034 : [기초-출력변환] 8진 정수 1개 입력받아 10진수로 출력하기
    @Override
    public Solution CodeUp1004(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("8진수 정수를 입력하세요");
        int tenNum = Integer.parseInt(scanner.nextLine(),8);
        solution.setStrResult(String.valueOf(tenNum));
        return solution;
    }


//1035 : [기초-출력변환] 16진 정수 1개 입력받아 8진수로 출력하기
    @Override
    public Solution CodeUp1005(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("16진수 정수를 입력하세요");
        int tenNum = Integer.parseInt(scanner.nextLine(),16);
        solution.setStrResult("8진수 : "+ Integer.toOctalString(tenNum));
        return solution;
    }

// 1036 : [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기
    @Override
    public Solution CodeUp1006(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("영문자 입력하세요");
        int time = scanner.next().charAt(0);
        solution.setStrResult(String.valueOf(time));
        return solution;
    }

//    1027 : [기초-입출력] 년월일 입력 받아 형식 바꿔 출력하기
    @Override
    public Solution CodeUp1007(Solution solution) {
        return solution;
    }



// 1028 : [기초-데이터형] 정수 1개 입력받아 그대로 출력하기2    @Override
    public Solution CodeUp1008(Solution solution) {
        return solution;
    }

//    1029 : [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2
    @Override
    public Solution CodeUp1009(Solution solution) {
        return solution;
    }


//    1030 : [기초-데이터형] 정수 1개 입력받아 그대로 출력하기3
    @Override
    public Solution CodeUp1010(Solution solution) {
        return solution;
    }
}
