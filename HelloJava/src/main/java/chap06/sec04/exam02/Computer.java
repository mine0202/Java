package chap06.sec04.exam02;

/**
 * packageName : chap06.sec04.exam02
 * fileName : Computer
 * author : ds
 * date : 2022-09-28
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Computer {
//    매개변수 : 배열 전달하는 함수
//    실무에서 함수 설계하는데 현재 매개변수 2개만 사용하다가 나중에 5~10개... 몇개가될지 모름(고객요구사항변경)
//    해결책 : 매개변수를 배열로 만들면 됨
//    모든 매개변수 값을 더하기 함수
    int sum1(int[] value) {
        int sum = 0;
//        매개변수 배열의 개수까지 모두 더하는 로직
        for (int i = 0; i<value.length;i++){
            sum += value[i];
        }
        return sum;
    }

//    곱하기 함수 만들기
    int muti(int[] value){
//        곱하기 이기때문에 times 는 1 로 설정.
        int times = 1;
        for ( int y = 0 ; y < value.length; y++){
            times *= value[y];
        }
        return times;
    }

//    자바의 새로운 문법
//    매개변수 더하기 함수 2
//    매개변수 배열 형태를 자동으로 만들어 주는 연산자 ( 배열의 원소들이 하나씩 들어옴 )
    int sum2(int... values){
        int sum = 0;
        for ( int i =0; i< values.length;i++){
            sum += values[i];
        }
        return sum;
    }


}

