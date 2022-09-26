package chap04;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : ds
 * date : 2022-09-23
 * description : 조건문
 * 요약 :
 *      if 문 - if (조건식1){실행문}/else if(조건식2){실행문2}/else{실행문3}
 *      조건식1... 2까지 각각 true/false 인지 판단해서 실행할지 결정
 *      switch 문 - switch(변수) { case값1: 실행문1 break; ... default: 실행문n}
 *      변수의 값을 판단해서 변수 값이 값1이면 실행문1이 실행.. 모두 아니면 default 실행
 *      사용시 실행문 실행하고 break; 로 빠져나와야함.
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-23         ds          최초 생성
 */
public class Sec0401 {
    public void exam01(){
        int score = 93;
//        score >= 90 이면 점수가 90 보다 큽니다. 등급은 A 입니다.
//        score < 90 이면 점수가 90 보다 작습니다. 등급은 B 입니다.

        if ( score >= 90 ){
            System.out.println("점수가 90 보다 큽니다.\n 등급은 A 입니다.");
        }
        else {
            System.out.println("점수가 90 보다 작습니다.\n 등급은 B 입니다.");
        }
    }

    public void exam02(){
//        랜덤함수 : 0~1 사이의 아무 실수를 뽑는 함수
//         1 과 7 미만의 정수
//        랜덤함수 : 0.0 <= Math.random() < 1.0
//         1부터 10까지의 정수를 뽑기
//         0.0 <= Math.random()*10 < 10.0   실수이므로
//         (int)(Math.random()*10) 정수로 바꿈
//         1부터 10까지 이므로  (int)(Math.random()*10)+1  함.
        int num = (int)(Math.random()*6)+1;
//        num == 1 이면 1번 출력
//        num == 2 이면 2번 출력
//        num == 3 이면 3번 출력
//        num == 4 이면 4번 출력
//        num == 5 이면 5번 출력
//        num == 6 이면 6번 출력
//        for ( int i=0; i<num;i++){
//            System.out.println(num+"번 출력");
//        }
        if ( num == 1) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 2) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 3) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 4) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 5) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 6) {
            System.out.println(num+"번 출력");
        }
    }
    public void exam03() {
//        랜덤함수 응용
//        8~ 11 까지의 정수 얻기
//        8이면 "출근합니다."
//        9이면 "회의를 합니다."
//        10이면 " 업무를 봅니다."
//        나머지 " 외근을 나갑니다." 출력하는 프로그램을 작성하세요
        int num = (int)(Math.random()*4)+8;
        if( num == 8) {
            System.out.println("출근합니다.");
        }
        else if (num == 9) {
            System.out.println("회의를 합니다.");
        }
        else if (num == 10) {
            System.out.println("업무를 봅니다.");
        }
        else  {
            System.out.println("외근을 나갑니다.");
        }
//        조건문 : 1) if 문
//                2) switch 문 : 변수의 값을 조사해서 각각의 상황(case 값) 과
//                              일치하는 조건문이 실행됨
        switch(num){
            case 8 :
                System.out.println("출근합니다.");
                break;
            case 9 :
                System.out.println("회의를 합니다.");
                break;
            case 10 :
                System.out.println("업무를 봅니다.");
                break;
            default:
                System.out.println("외근을 나갑니다.");
                break;
        }
    }
    public void exam07(){
//        char 자료형 변수를 이용해서 'A' 또는 'a' 이면 "우수회원입니다."
//                                 'B' 또는 'b' 이면 "일반회원입니다." 출력하세요
//                                 그외 " 손님입니다." 출력.
//        switch 문으로 작성.
        char grade = 'b';
        switch (grade){
            case 'A' :
            case 'a':
                System.out.println("우수 회원입니다.");
                break;
            case 'B' :
            case 'b':
                System.out.println("일반 회원입니다.");
                break;
            default:
                System.out.println("손님입니다.");
                break;
        }

    }
}
