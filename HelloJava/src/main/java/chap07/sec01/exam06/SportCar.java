package chap07.sec01.exam06;

/**
 * packageName : chap07.sec01.exam06
 * fileName : SportCar
 * author : ds
 * date : 2022-09-29
 * description : 자식클래스
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class SportCar extends Car{
    @Override
    public void speedUp() {
        speed +=10;
    }

//    final 이 붙은 함수는 재정의 할 수 없음. stop() 함수.
//    @Override 목록에 나오지 않음.

}
