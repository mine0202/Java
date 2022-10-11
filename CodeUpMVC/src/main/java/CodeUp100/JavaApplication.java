package CodeUp100;

import CodeUp100.model.Solution;
import CodeUp100.service.SolutionService;
import CodeUp100.service.SolutionService11Impl;

//실행클래스
public class JavaApplication {
    public static void main(String[] args) {
        Solution solution = new Solution(); // 모델생성
//        다형성 이용 : 서비스 생성
//        SolutionService solutionService = new SolutionServiceImpl();
        SolutionService solutionService = new SolutionService11Impl();

//        solutionService.CodeUp1001(solution);
////        결과출력, Getter 이용 값 가져오기
//        System.out.println(solution.getStrResult());
//
//        solutionService.CodeUp1002(solution);
//        System.out.println(solution.getStrResult());
//
//        solutionService.CodeUp1003(solution);
//        System.out.println(solution.getStrResult());
//
//        solutionService.CodeUp1004(solution);
//        System.out.println(solution.getStrResult());
////
//        solutionService.CodeUp1005(solution);
//        System.out.println(solution.getStrResult());
//
//        solutionService.CodeUp1006(solution);
//        System.out.println(solution.getStrResult());
//
//        solutionService.CodeUp1007(solution);
//        System.out.println(solution.getStrResult());
//
//        solutionService.CodeUp1008(solution);
//        System.out.printf(solution.getStrResult());
//
//        solutionService.CodeUp1010(solution);
//        System.out.println(solution.getStrResult());

    }
}
