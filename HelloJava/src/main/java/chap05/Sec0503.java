package chap05;

import java.util.Calendar;

/**
 * packageName : chap05
 * fileName : Sec0503
 * author : ds
 * date : 2022-09-27
 * description : 열거형 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-27         ds          최초 생성
 */
public class Sec0503 {
    public void EnumWeek() {

//    예제 :  요일을 체크해서 일요일(sunday) 이면 "일요일에는 축구를 합니다." 출력
//                          그 외 요일에는 "열심히 자바 공부를 합니다." 출력
//     Week 열거형 클래스, 아래와 같이 정의 , 상수값을 넣을 수 있음.

        Week today = null;

//    자바에서 제공하는 날짜(달력) 객체 가져오기
//     Calendar 객체 new 사용하지 않고 .getInstance() 통해서 객체 생성 [ 정적(전역) 클래스 ]
        Calendar calendar = Calendar.getInstance();
//    Calendar 에는 다음과 같이 요일이 숫자로 정해짐 : 일요일 (1) , 월요일(2) ,... , 토요일(7)
//    Calendar.YEAR 등...
//    Calendar.DAY_OF_WEEK : 요일 정보
//    calendar.get(요일정보) : 요일 가져오기 (반환값 : 정수 )
        int week = calendar.get(Calendar.DAY_OF_WEEK);

//        조건문
        switch (week) {
            case 1:
                today = Week.SUNDAY;
                break;
            case 2:
                today = Week.MONDAY;
                break;
            case 4:
                today = Week.WEDNESDAY;
                break;
            case 3:
                today = Week.TUESDAY;
                break;
            case 6:
                today = Week.FRIDAY;
                break;
            case 7:
                today = Week.SATURDAY;
                break;
            case 5:
                today = Week.THURSDAY;
                break;
        }

//        오늘의 요일 출력
        System.out.println("오늘의 요일 : "+ today );
        if ( today == Week.SUNDAY){
            System.out.println("일요일에는 축구를 합니다.");
        }
        else {
            System.out.println("열심히 자바 공부를 합니다.");
        }
    }


}
