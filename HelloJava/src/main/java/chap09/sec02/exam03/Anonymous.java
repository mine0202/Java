package chap09.sec02.exam03;

/**
 * packageName : chap09.sec02.exam03
 * fileName : Anonymous
 * author : ds
 * date : 2022-10-04
 * description :  익명객체의 지역 변수 사용
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class Anonymous {
    private int field;

//    일반 함수 내에서 지역변수로 익명객체 사용
    public void method(int arg1, int arg2){
        int var1 = 0;
        int var2 = 0;

//        var1, var2, arg1, arg2 변경 불가, 지역변수 매개변수 모두 상수로 변환(final 생략)
//        var1 = 1;  상수로 변경되어서 사용하지 못함. 불가
//        var2 =1;   상수로 변경되어서 사용하지 못함.
//        arg1 =1;   상수로 변경되어서 사용하지 못함.
//        arg2 =2;   상수로 변경되어서 사용하지 못함.

        field = 10;  // 속성
//        지역변수 = new 부모인터페이스() { 익명객체 };
        Calcualtor calcualtor = new Calcualtor() {
            @Override
            public int sum() {
                int result = field + arg1 +arg2 + var1 + var2;
                return result;
            }

        };
        System.out.println(calcualtor.sum()); // 익명객체의 함수 사용
    }
}
