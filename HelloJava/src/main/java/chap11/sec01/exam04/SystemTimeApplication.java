package chap11.sec01.exam04;

/**
 * packageName : chap11.sec01.exam04
 * fileName : SystemTimeApplication
 * author : ds
 * date : 2022-10-05
 * description : 프로그램 실행 소요 시간 구하기
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class SystemTimeApplication {
    public static void main(String[] args) {
//        1. 처음 시간 체크 ( 컴퓨터 설정된 현재시간 )
        long time = System.nanoTime();  //   1/10^9 시간
//        2. 실행
        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum +=i;
        }
//        3. 마지막 시간 체크
        long time2 = System.nanoTime();
//        4. 마지막 시간 - 처음시간 = 소요시간
        System.out.println("1부터 100만까지 합 = "+ sum);
        System.out.println("계산 소요시간 = "+(time2- time));
    }
}
