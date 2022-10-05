package chap11.sec02.exam01;

import java.util.Calendar;

/**
 * packageName : chap11.sec02.exam01
 * fileName : CalendarApplication
 * author : ds
 * date : 2022-10-05
 * description : Calendar 달력 객체
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
public class CalendarApplication {
    public static void main(String[] args) {
//        객체생성 : new 생성자();
        Calendar now = Calendar.getInstance();  // 싱글톤 ( 디자인패턴 ) , 공유객체

//        달력정보들
        int year = now.get(Calendar.YEAR);  // 년
        int month = now.get(Calendar.MONTH) + 1 ;  // 월
        int week = now.get(Calendar.DAY_OF_WEEK); // 요일,  숫자로 나옴 , 1(일) 2(월) 3(화) 4(수) 5(목) 6(금) 7(토)
        int day = now.get(Calendar.DAY_OF_MONTH); // 일

        System.out.println(year+"년" + month+"월" + day +"일"+ week);

//        현재 날짜 시간정보
        int hour = now.get(Calendar.HOUR); // 시간
        int minute = now.get(Calendar.MINUTE); // 분
        int second = now.get(Calendar.SECOND); // 초

        System.out.println(hour+"시" + minute+"분" + second +"초");
    }
}
