package chap04;

/**
 * packageName : chap04
 * fileName : Sec0401
 * author : ds
 * date : 2022-09-23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-23         ds          최초 생성
 */
public class Sec0401 {
    public void exam01(){
        int score = 93;
//        score >= 90 이면 점수가 90 보다 큽니다. 등급은 A 입니다.
//        score < 90 이면 점수가 90 보다 작습니다. 등급은 B 입니다.

        if ( score >= 90 ){
            System.out.println("점수가 90 보다 큽니다.\n 등급은 A 입니다.");
        }
        else {
            System.out.println("점수가 90 보다 작습니다.\n 등급은 B 입니다.");
        }

    }

    public void exam02(){
//        랜덤함수 : 0~1 사이의 아무 실수로 뽑는 함수
//         1 과 7 미만의 정수
        int num = (int)(Math.random()*6)+1;
//        num == 1 이면 1번 출력
//        num == 2 이면 2번 출력
//        num == 3 이면 3번 출력
//        num == 4 이면 4번 출력
//        num == 5 이면 5번 출력
//        num == 6 이면 6번 출력
        if ( num == 1) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 2) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 3) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 4) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 5) {
            System.out.println(num+"번 출력");
        }
        else if ( num == 6) {
            System.out.println(num+"번 출력");
        }
    }
}
