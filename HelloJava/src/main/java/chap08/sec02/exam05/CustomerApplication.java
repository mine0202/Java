package chap08.sec02.exam05;

/**
 * packageName : chap08.sec02.exam05
 * fileName : CustomerApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
// 문제 : 아래 결과를 Customer 클래스를 완성하세요.
// 결과 :
//  구매하기
//  판매하기
//  고객 판매 주문

public class CustomerApplication {
    public static void main(String[] args) {
        Customer customer = new Customer();

        Buy buyer = customer;
        buyer.buy();  // 구매하기

        Sell seller = customer;
        seller.sell();  // 판매하기

        if( seller instanceof Customer){
            Customer customer2 = (Customer) seller;  // 클래스 원복
            customer2.order(); // 고객 판매 주문
        }
    }
}
