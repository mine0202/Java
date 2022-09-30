package chap08.sec02.exam05;

/**
 * packageName : chap08.sec02.exam05
 * fileName : Customer
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("구매하기");
    }

    @Override
    public void sell() {
        System.out.println("판매하기");
    }

    public void order(){
        System.out.println("고객 판매 주문");
    }
}
