package CodeUp100.service;


import CodeUp100.model.Solution;

import java.util.Scanner;


// 구현 클래스 - 업무로직 함수들 모임
public class SolutionServiceImpl implements SolutionService{

    @Override
    public Solution CodeUp1001(Solution solution) {
//        Getter/ Setter 함수를 이용
//        속성 접근 금지
//        속성에 값을 저장  Setter 이용
        solution.setStrResult("Hello");  // 객체를 매개변수로 저장하고
        return solution;  // 객체를 리턴한다
    }

    @Override
    public Solution CodeUp1002(Solution solution) {
        solution.setStrResult("Hello World");
        return solution;
    }

    @Override
    public Solution CodeUp1003(Solution solution) {
        solution.setStrResult("Hello\nWorld");
        return solution;
    }

    @Override
    public Solution CodeUp1004(Solution solution) {
        solution.setStrResult("\'Hello\'");
        return solution;
    }

    @Override
    public Solution CodeUp1005(Solution solution) {
        solution.setStrResult("\"Hello World\"");
        return solution;
    }

    @Override
    public Solution CodeUp1006(Solution solution) {
        solution.setStrResult("\"!@#$%^&*()\"");
        return solution;
    }

    @Override
    public Solution CodeUp1007(Solution solution) {
        solution.setStrResult("\"C:\\Download\\hello.cpp\"");
        return solution;
    }

    @Override
    public Solution CodeUp1008(Solution solution) {
        solution.setStrResult("\u250C\u252C\u2510\n\u251C\u253C\u2524\n\u2514\u2534\u2518\n");
        return solution;
    }


    @Override
    public Solution CodeUp1010(Solution solution) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        solution.setStrResult(scanner.nextLine());
        return solution;
    }
}
