package jungsuk.chap11;

import java.util.ArrayList;
import java.util.List;

// Collections  클래스의 공유함수 모두* import
// import 라이브러리패키지.*  : 모든 클래스를 의미
import static java.util.Collections.*;

// Collections ( 자바의 자료구조 ) 에 유용한 공유 함수들이 많음.
// Collections  : List , Set , Map  을 대표하는 클래스
// 자료구조 : 배열을  개선한 여러가지 데이터를 다루는 구조( 함수형태 데이터 추가/삭제/검색 )
public class Ex11_19 {
    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

//        collections 자료구조 공유함수들
        System.out.println("--------------- 데이터 넣기 ------------");
//        자료구조 : Data Structure
//        사용법 : addAll (자료구조객체 ,배열원소 );
        addAll(list, 1,2,3,4,5);
//        출력 : 자료구조객체를 바로 매개변수로 넣으면 값이 출력됨 ( 배열은 메모리 주소값이 나옴)
        System.out.println(list);

        System.out.println("----------- 오른쪽으로 두칸이동 ----------");
//        사용법 : rotate ( 자료구조객체 , 오른쪽 칸이동)
        rotate(list,2);
        System.out.println(list);  //  4,5,1,2,3

        System.out.println("-----첫번째와 세번째 요소 교환(swap)-------");
//        사용법 : swap ( 자료구조객체 , 원본요소, 바꿀요소 )
        swap(list,0,2);
        System.out.println(list);  //  1,5,4,2,3

        System.out.println("--- 저장된 요소의 위치를 임의로 변경 : 섞기 ---");
//        사용법 : shuffle ( 자료구조객체 )
        shuffle(list);
        System.out.println(list);   // 랜덤

        System.out.println("--- 역순 정렬 reverse(list)와 동일 -----");
        sort(list, reverseOrder()); // 내림차순 정렬
        System.out.println(list);   //  [ 5,4,3,2,1 ]

        System.out.println("--- 정렬 : 오름차순  ------");
        sort(list);  // 오름차순 정렬
        System.out.println(list);   // [ 1,2,3,4,5 ]

        System.out.println("--- binary search ----");
//        사용법 binarySearch(자료구조객체, 검색할 값)
        int idx = binarySearch(list, 3);   // 3의 값이 있는 인덱스 위치가 리턴
        System.out.println("3의 위치 : "+ idx);   //  2

        System.out.println("---- max/min -----");
        System.out.println("max = "+max(list));  // 자료구조에서 최고값을 찾아줌  5
        System.out.println("min = "+min(list));  // 자료구조에서 최소값을 찾아줌  1

        System.out.println("--- fill ------");
//        사용법 : fill ( 자료구조객체 , 채울값 )
        fill(list, 9);
        System.out.println(list);  //  [ 9,9,9,9,9 ]

        System.out.println("--- copy  ------------------");
        List newList = new ArrayList(); // 빈 리스트 생성
        addAll(newList, list);  // newList 끝에다가 list 추가. copy 효과
        System.out.println(newList);  // list 를 추가했으므로 2차배열이됨
//         [[9,9,9,9,9]]

        System.out.println("------ 모두바꾸기 replaceAll-------");
        replaceAll(list, 9 , 1); // 9를 1로 모두 변경
        System.out.println(list);  // [1,1,1,1,1]

    }
}
