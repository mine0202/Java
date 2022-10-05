package chap11.sec02.exam03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// LinkedList  : ArrayList 단점 개선, 중간에 데이터가 추가/삭제되면 속도저하를 개선
//    구분  :         | 순차적으로 추가 /삭제  |   중간에 추가/삭제  |
//      ArrayList    |       빠르다         |       느리다      |
//      LinkedList   |       느리다         |       빠르다      |
public class LinkedListApplication {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();


        long startTime;
        long endTime;

//        처음시간
        startTime = System.nanoTime();

//        ArrayList 실행
        for (int i = 0; i < 10000; i++) {
//            중간에 추가
            list.add(0,String.valueOf(i)); // 정수를  문자열로 변환해서 0번위치에 계속 추가
        }

        endTime = System.nanoTime();
        System.out.println("ArrayList 걸린시간 : " + (endTime-startTime)+ "ns");


        //        처음시간
        startTime = System.nanoTime();

//        LinkedList 실행
        for (int i = 0; i < 10000; i++) {
//            중간에 추가
            list2.add(0,String.valueOf(i)); // 정수를  문자열로 변환해서 0번위치에 계속 추가
        }

        endTime = System.nanoTime();

        System.out.println("LinkedList 걸린시간 : " + (endTime-startTime)+ "ns");
    }
}
