package chap13.sec02.exam01;

/**
 * packageName : chap13.sec02.exam01
 * fileName : Coin
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */

// Model : 데이터를 저장 또는 조회 용도로 사용하는 클래스(객체)
//    속성 , 생성자 , getter , setter 만 있음
//    Stack(스택) : 자바에서 스택이라는 자료구조를 구현해 놓음
//                 LIFO ( Last In First Out ) 나중에 들어온 자료가 먼저 나가는 구조
//    Stack의 주요함수
//        .push (객체) : 주어진 객체를 스택에 넣기
//        .pop() : 스택의 맨 위에 있는 객체를 꺼냄, 스택에서 제거함
//        .peek() : 스택의 맨 위 객체의 정보를 조회만하고 스택에서 제거하지 않음
//    스택 응용 : 계산기프로그램
public class Coin {
    private int value;

//    속성을 만들고 생성자 만듬
    public Coin(int value) {
        this.value = value;
    }

//    getter 만들기 : 속성의 값을 조회하는 함수
    public int getValue() {
        return value;
    }

//    setter : 속성의 값을 저장하는 함수
    public void setValue(int value) {
        this.value = value;
    }
}
