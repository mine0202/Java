package chap04;

/**
 * packageName : chap04
 * fileName : Sec0402
 * author : ds
 * date : 2022-09-26
 * description : 반복문
 * 요약:
 *      for 문 : for ( int 변수 = 초기값; 조건식 ; 증감식 ) { 반복문 }
 *      조건식이 true 일때만 반복문 실행됨
 *      while 문 :
 *                초기화식
 *                while (조건식 ) {
 *                    반복문;
 *                    증감식;
 *                }
 *      조건식이 true 일때만 반복문 실행됨
 *      do ~  while문 : do{반복문} while (조건식);
 *      최초 1번은 반복문이 실행되고 그다음에 조건식이 true 인지 판단함
 *      break : 반복문 강제 중단
 *      continue : 아래 라인 실행 안하고 , 증감식 또는 조건식으로 강제 이동
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-26         ds          최초 생성
 */
public class Sec0402 {
    public void exam01(){
//         1부터 100 까지의 합을 출력하기
        int result = 0;

        for ( int i = 0 ; i <=100 ; i++){
            result += i;
        }

        //         초기값 int i =0;을 for 문 밖으로 빼도 됨.
        int  a= 0;
        for (a=1; a<=100 ; a++){
            result += a ;
        }
        System.out.println("합 :" + result);
    }
    public void exam02(){
//        반복문을 실수로 반복하기
//        실수로 반복문을 실행하는 것은 가능하나 결과에 오차가 생길수 있음. (권고하지 않음 )
//        현대 코딩언어 : 부동소수점 법을 사용 ( 장점 : 실수를 엄청 많이 사용할 수 있음, 단점 : 오차 발생)
//         옛날 코딩언어 : 고정소수점 법을 사용( 장점:정확도가 높음, 단점 : 실수를 많이 표현 못함)
        for ( float x= 0.1f ; x <= 1.0f ; x +=0.1f){
            System.out.println(x);
        }
    }
//    자바언어로 구구단 출력하기
    public void exam03() {
//        2단 ~ 9단 까지 출력
//        중첩 for 문 == 2중 loop
        for ( int a = 2; a <=9 ; a++) {
            System.out.println("*** "+ a + " 단"+ " ***");
            for ( int b=1 ; b<=9; b++){
                System.out.println(a+" * "+ b +" = "+ (a*b));
            }
            System.out.println("------------------");
        }
    }
//    자바에서 사용하는 반복문
//    1) for 문
//    2) while 문

//    for 문을 while 문으로 고치시오
    //         1부터 100 까지의 합을 출력하기
//    while 문  문법 :
//          초기값 지정;
//          while(조건식){
//              반복문;
//              증감식;
//          }
    public void exam04(){
        int result = 0;
        int i = 0;
        while ( i <=100 ){
            result += i;
            i ++;
        }
        System.out.println("합 : " + result);
    }

//    do ~ while 문으로 수정
//    먼저 반복문 1번 실행후 조건식 검사하기 때문에 반복문 1번은 실행하게 됨.
    public void exam05(){
        int result = 0;
        int i = 0;
        do {
            result += i;
            i ++;
        }
        while(i<=100);
        System.out.println("합 : " + result);
    }
//    break : 반복문 강제 빠져 나오기
    public void exam06() {
//         1~6 까지 임의의 정수를 뽑아서 출력하고 , 만약 6이 나오면 break 중단하고 나오는 프로그램을 코딩하세요

//        while ( true){
//            int i = (int) (Math.random() * 6) + 1;
//            System.out.println(i);
//            if( i ==6) {
//                break;
//            }
//        }

        int i ;
        do {
             i = (int) (Math.random() * 6) + 1;
            System.out.println(i);
            if(i==6){
                break;
            }
        }
        while(true);
    }

//    1부터 10까지 사이의 수 중에서 짝수만 출력하는 코드 : continue 문을 사용해서 코딩하기
//    continue 다음의 라인이 실행되지 않고 위 for 문의 조건식으로 강제이동.
    public void exam07(){
        for ( int i = 1 ; i<=10; i ++){
            if ( i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
//    자바8 에서 새로나온 문법
//    반복문 사용하는 라벨
//     2중 loop 에서 바깥쪽 for 문 'A' ~ 'Z' 반복하고
//                  안쪽 for 문 'a'~ 'z' 반복함
//                  안쪽 for 문에서 소문자 g 가 나오면 break; 반복문 중단하고 싶음
//                  안쪽 for 문에 break; 하면 안쪽은  중단되지만 바깥쪽 for 문 중단되지 않음
//    양쪽 다 중단 시키기 우해 라벨을 붙이면 그쪽까지 중간 가능 : break 라벨명
    public void exam08(){
        Outter:
            for(char upper='A';upper<='Z'; upper++){
                for( char lower='a'; lower<='z';lower++){
                    System.out.println(upper + "-"+lower);
                    if(lower== 'g'){
                        break Outter;
                    }
                }
            }
        System.out.println("프로그램 종료");
    }


}
