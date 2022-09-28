package chap02;

/**
 * packageName : chap02
 * fileName : Sec0204
 * author : ds
 * date : 2022-09-23
 * description : 클래스 ( 객체 정의 ) 설명
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-23         ds          최초 생성
 * 2022-09-23         ds            exam10() 함수 추가
 */
public class Sec0204 {
//    속성  ( 멤버변수 )

    public void  exam01 () {
        int value =123;
        System.out.println(value);
//        포멧에 맞추어서 출력하는 함수 printf()
//        %d  에 value(정수) 값이 들어감.
        System.out.printf("상품의 가격 : %d\n",value);
        System.out.printf("상품의 가격 : %6d\n",value);
        System.out.printf("상품의 가격 : %-6d\n",value);
        System.out.printf("상품의 가격 : %06d\n",value);

//        원의 넓이 계산
        double area = 3.14159 *10 * 10;

//        %d 에 10 이 들어가고, %10.2f 에는 area 가 들어감.  %10.2f 는 소수 2째자리까지 표시, 반올림
        System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area );

//        문자열
        String name = "홍길동";
        String job = "도적";

//        % 가 3개 있으면 뒤에도 3개가 있어야함.
        System.out.printf("%6d | %-10s | %10s\n",1,name,job);
    }


    public void exam02() throws java.io.IOException {
//        예외를 지정.
//         키코드 입력 (정수) : enter, shift , space 등 키 번호 (정수로 되어있음 )
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode : "+keyCode);
    }
    public void exam03() throws java.io.IOException {
        int KeyCode;
//        무한 반복문 while(true) { }
        while(true){
            KeyCode = System.in.read();
            System.out.println("KeyCode:"+ KeyCode);
//            break 반복문 탈출조건
            if (KeyCode==113){
                break;
            }
        }
    }
}
