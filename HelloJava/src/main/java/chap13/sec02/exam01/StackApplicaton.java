package chap13.sec02.exam01;

import java.util.Stack;

/**
 * packageName : chap13.sec02.exam01
 * fileName : StackApplicaton
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */

//Stack 구현 클래스
public class StackApplicaton {
    public static void main(String[] args) {
//        스택 객체 생성
        Stack<Coin> coinStack = new Stack<>();

//        Coin 객체가 Stack 4개 들어감
        coinStack.push(new Coin(100));
        coinStack.push(new Coin(50));
        coinStack.push(new Coin(500));
        coinStack.push(new Coin(10)); // 먼저나옴

//        coinStack에 자료가 있는지 확인 isEmpty(), 하나라도 있으면 false , 하나라도 없으면 true
        while (!coinStack.isEmpty()){
            Coin coin = coinStack.pop();  // 스택에서 한개(coin 객체) 꺼내기
//            coin.getValue() : Coin 객체의 getter 함수 ( 명명법 : get속성명() )
//             스택에서 꺼낸 coin 객체의 값을 불러옴
            System.out.println("꺼낸 동전 : "+coin.getValue() + "원");
        }
    }
}
