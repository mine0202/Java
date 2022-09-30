package chap07.verify.exam03;

/**
 * packageName : chap07.verify.exam03
 * fileName : GoodCalc
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class GoodCalc extends Calculator{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int subtract(int a, int b) {
        return a-b;
    }

    @Override
    public double average(int[] a) {
        int result = 0;
        for ( int i =0; i<a.length; i++){
            result += a[i];
        }
        return (double) result/a.length;
    }
}
