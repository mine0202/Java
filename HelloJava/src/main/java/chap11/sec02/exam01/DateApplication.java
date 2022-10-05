package chap11.sec02.exam01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateApplication {
    public static void main(String[] args) {
        // java.util.Date  많이 사용함.
        Date now = new Date();  // 현재날짜(컴퓨터날짜) 가져오기
        String strNow = now.toString(); // 날짜를 문자열로 변환
        System.out.println(strNow);

//        날짜 포맷 바꾸기
//        yyyy(년) , MM(월) , dd (일) , hh (시) , mm (분) , ss(초)
        SimpleDateFormat simpleDateFormat =
                new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");

//        simpleDateFormat.format(Date 객체) : 기본 날자형식을 위의 형식으로 바꾸어 문자열로 저장함.
        String strNow2 = simpleDateFormat.format(now);
        System.out.println(strNow2);
    }
}
