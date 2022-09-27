package chap05;

/**
 * packageName : chap05
 * fileName : Verify05
 * author : ds
 * date : 2022-09-27
 * description : 종합 연습문제 ( 배열 / 열거형 )
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
public class Verify05 {
//    주어진 배열에서 최대값을 구해보세요.
    public void Exam04(){
        int max =0;
        int[] array = {1,5,3,8,2};

//        최대값 구하기
//        결과   max : 8
//        max 는 최초 0이고 , 배열에 있는 값과 비교해서 작으면 배열의 값을 max에 넣고 , max 가 크면 무시
//        반복문이 전부 실행되고 나서는 max 에는 최대값이 들어가 있음.
        for ( int i = 0; i< array.length; i++){
            if ( max < array[i]){
                max = array[i];
            }
        }
        System.out.println("max : "+  max);
    }

//    2중 for 문을 이용해서 주어진 배열의 전체 항목의 합과 평균을 구해보세요
//    결과 :
//        sum : 881
//        avg : 88.1
    public void Exam05(){
        int[][] array = {{95,86},{83,92,96},{78,83,93,87,88}};

        int sum =0;
        double avg = 0.0;
        int count = 0;
        for ( int i = 0 ; i < array.length; i++){
            for ( int y = 0 ; y < array[i].length; y++){
                sum += array[i][y];
                count ++;
            }
        }
        avg = (double)sum/count;
        System.out.println("sum : "+ sum);
        System.out.println("avg : "+ avg);
    }
// 실무에서 열거형 ( 상수들) 을
//    에러코드 : 개발자 에러코드를 정의  -> 프로그램의 업무용 문자메세지 등
//    변경되면 안되는 것에 많이 사용함.

//    열거형 문제
//    아래 enum 클래스 정의 ( SUCCESS ,FAIL_ID, FAIL_PASSWORD ) 하고, Exam0302() 함수안에 enum 상수를 비교해서
//    SUCCESS 이면 "로그인 성공" , FAIL_ID 이면 "아이디가 틀립니다."
//    FAIL_PASSWORD 이면 "패스워드가 틀립니다." 출력해 주세요.
    public void Exam0302(){
        LoginResult result = LoginResult.FAIL_PASSWORD;

//         조건문 체크
        if( result == LoginResult.SUCCESS){
            System.out.println("로그인 성공");
        }
        else if ( result == LoginResult.FAIL_ID ){
            System.out.println("아이디가 틀립니다.");
        }
        else if ( result == LoginResult.FAIL_PASSWORD){
            System.out.println("패스워드가 틀립니다.");
        }
    }
}
