package chap06.sec06.exam05;

/**
 * packageName : chap06.sec06.exam05
 * fileName : Car
 * author : ds
 * date : 2022-09-29
 * description : 접근제한자(제어자) / Setter / Getter
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class Car {
//    public : 공용 , 모든 클래스에서 사용 허용
//    private : 다른 클래스에서는 사용불가. 오직 자신의 클래스에서만 사용가능
    private int speed;
    private boolean stop;

//    세터 / 게터
//    getter 목적 : 속성의 값 ( 정보)을 확인할 때 사용.
//    함수 명명법 : get속성명()
    public int getSpeed(){
        return speed;
    }

    //    setter 리턴 값이 없다 : 속성(speed, stop) 의 값을 수정하고 싶을때 사용.
//    함수 명명법 : set속성명()

    public void setStop(boolean stop) {
        this.stop = stop;
    }

//    alt + insert 누르면 getter / setter  를 만들수 있음

//     목적 : 속성은 다른 객체에서 사용하지 못하게 막고,
//           함수는 다른 객체에서 사용할수 있도록 코딩하는 것이 객체지향의 표준 코딩 방법
//           이것을 캡슐화 라고 함.

//    ex) 자동차의 속도는 음수가 나오면 안되는데 다른 객체에서 자동차.speed =-100;  가 입력되면
//         프로그램의 신뢰성 저하( 무결성(결점이 없다) 깨짐 )
//    이것을 막기위해 다음과 같이 코딩하여 다른 객체에서 사용
    public void setSpeed(int speed){
        if(speed >0){
            this.speed = speed;
        }
        return;
    }

}
