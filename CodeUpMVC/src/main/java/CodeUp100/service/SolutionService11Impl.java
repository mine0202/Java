package CodeUp100.service;


import CodeUp100.model.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


// 구현 클래스 - 업무로직 함수들 모임
public class SolutionService11Impl implements SolutionService{

    @Override
    public Solution CodeUp1001(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자를 입력하세요");
        solution.setStrResult(String.valueOf(scanner.nextInt()));
        return solution;
    }

    @Override
    public Solution CodeUp1002(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요");
        solution.setStrResult(String.valueOf(scanner.nextDouble()));
        return solution;
    }

    @Override
    public Solution CodeUp1003(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요");
        solution.setStrResult(scanner.nextLine());
        return solution;
    }

    @Override
    public Solution CodeUp1004(Solution solution) {
//        String result ="";
        Scanner scanner = new Scanner(System.in);
//        System.out.println("두 정수를 입력하세요");
//        String str = scanner.nextLine();
//        for (int i = str.length()-1; i >=0 ; i--) {
//            result += str.charAt(i);
//        }
//        solution.setStrResult(result);

        String strFirst = scanner.next();  // 첫번째 공백을 기준으로 문자열 입력
        String strSecond = scanner.next();  // 두번째 공백을 기준으로 문자열 입력
        solution.setStrResult(strSecond+ " "+ strFirst);
        return solution;
    }

    @Override
    public Solution CodeUp1005(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("실수를 입력하세요");
        double dbFirst = Math.round(scanner.nextDouble()*100)/100.0;
        solution.setStrResult(String.valueOf(dbFirst));
        return solution;
    }

    @Override
    public Solution CodeUp1006(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int intInput = scanner.nextInt();
        solution.setStrResult(intInput +" "+ intInput+" " +intInput);
        return solution;
    }

    @Override
    public Solution CodeUp1007(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력하세요");
        String[] strInput = scanner.nextLine().split(":");
        List<String> list = new  ArrayList<>(Arrays.asList(strInput));
        solution.setStrResult(list.get(0)+":"+list.get(1));
        return solution;
    }
//1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
    @Override
    public Solution CodeUp1008(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("연월일을 입력하세요");
        String[] result = scanner.nextLine().split("\\.");
        int iresult = Integer.parseInt(result[0]);
        int iresult1 = Integer.parseInt(result[1]);
        int iresult2= Integer.parseInt(result[2]);
        String strResult = String.format("%02d.%02d.%02d",iresult,iresult1,iresult2);
        solution.setStrResult(strResult);
        return solution;
    }

    @Override
    public Solution CodeUp1009(Solution solution) {
        return solution;
    }

    @Override
    public Solution CodeUp1010(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("주민번호 앞 6자리와 뒷 7자리가 '-'로 입력된다");
        String[] strInput = scanner.nextLine().split("-");
//        풀이 1번
//        solution.setStrResult(strInput[0]+ strInput[1]);
//        풀이 2번
        List<String> list = new ArrayList<>(Arrays.asList(strInput)); // 배열을 List 변환
        solution.setStrResult(list.get(0)+ list.get(1));

        return solution;
    }
}
