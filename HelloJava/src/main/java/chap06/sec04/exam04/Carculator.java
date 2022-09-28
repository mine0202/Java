package chap06.sec04.exam04;

/**
 * packageName : chap06.sec04.exam04
 * fileName : Carculator
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Carculator {
    int plus(int x , int y ){
        int result = x+y ;
        return result;
    }

//    리턴값이 있는 평균함수
    double avg(int x , int y){
        double sum = plus(x,y);   // 위에 있는 함수(더하기) 재사용
        double result = sum / 2 ;
        return result;
    }

//    평균을 구해서 출력하는 함수
    void execute(){
        double result = avg(7,10) ;  // 위의 평균 구하는 함수 호출
        println(result+"");  // 나의 프린트 함수를 만들어서 호출
    }

//    프린트 함수
    void println(String message){
        System.out.println( "계산 결과 : "+ message);
    }

}
