package chap06.sec04.exam06;

/**
 * packageName : chap06.sec04.exam06
 * fileName : Carculator
 * author : ds
 * date : 2022-09-28
 * description : 정사각형/ 직사각형의 면적을 구하는 클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-28         ds          최초 생성
 */
public class Carculator {
//    areaRectangle() 존재 : 매개변수 1개짜리, 매개변수2개짜리

    double areaRectangle(int width){
        return  width * width;
    }

    double areaRectangle(int width, int height){
        return  width * height;
    }
}
