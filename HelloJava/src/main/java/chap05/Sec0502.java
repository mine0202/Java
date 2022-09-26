package chap05;

/**
 * packageName : chap05
 * fileName : Sec0502
 * author : ds
 * date : 2022-09-26
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-26         ds          최초 생성
 */
public class Sec0502 {
    public void getStudent(){
        //    예제 학생의 성적을 저장하여 총합과 평균을 출력하는 프로그램을 작성

//    int score[] ={} ; 도 가능
//         값을 넣을때는 중괄호{ } , 선언할때는 대괄호[]
//         자바 배열 선언 : 자료형[] 변수명 = { 값1, ... 값n}
        int[] score = {83, 90, 87, 88, 89, 90, 91, 92, 93, 75};
        int sum = 0;

        for( int i = 0 ; i <10 ; i ++){
            sum += score[i];
        }
//        평균
        int avg = sum /10;
        System.out.println("sum="+sum+", avg ="+ avg);
    }

}
