package chap03;

/**
 * packageName : chap03
 * fileName : Sec0301
 * author : ds
 * date : 2022-09-23
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-23         ds          최초 생성
 */
public class Sec0301 {
    public void exam02(){
        int x=10;
        int y=10;
        int z;
        System.out.println("-------------------------");

//        변수++  , ++변수 : 증감연산자 (1 씩증가 )
        x++;
        ++x;
        System.out.println("x="+x);
        System.out.println("-------------------------");

        y--;
        --y;
        System.out.println("y="+y);
        System.out.println("-------------------------");

//      z= ++x +  y++ 에서 z 는 13 + 8 이되고 8 에 ++ 가 되어 y 가 9 가된다.
        z = ++x + y++;
        System.out.println("z="+z);
        System.out.println("x="+x);
        System.out.println("y="+y);

    }

    public void exam03(){
        boolean play = true;
        System.out.println(play);

         play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);
    }

    public void exam04(){
//        char 에 +1 을하면 아스키 코드의 하나 다음의 문자가 나온다.
        char c1 = 'A' +1;
        char c2 = 'A';
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
    }

    public void exam05(){
//        비교 연산자 : 자바스크립트 동일
        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1== num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1 :"+ result1);
        System.out.println("result2 :"+ result2);
        System.out.println("result3 :"+ result3);

        char char1 = 'A';
        char char2 = 'B';
        boolean result4 = (char1<char2);

        System.out.println("result4 : " + result4);

    }

    public void exam09(){
        int charCode = 'A';

//        charCode 가 대문자면 "대문자 이군요"
//        charCode 가 소문자면 "소문자 이군요"
//        charCode 가 숫자면 "숫자 이군요"  출력하기

        if ( (charCode >=65) && (charCode <=90) ){
            System.out.println("대문자 이군요");
        }
        else if ( (charCode >=97) && (charCode <=122) ) {
            System.out.println("소문자 이군요");
        }
        else if  ( (charCode >=48) && (charCode <=57)) {
            System.out.println("숫자이군요");
        }

//        논리연산자 : && (동시에, and ) , || ( 또는 , or )

        int value = 6;
//         나머지 연산자는 %
//         2또는 3의 배수이면 "2또는 3의 배수이군요"
//        아니면 "2또는 3의 배수가 아니군요"
        if ( (value %2 ==0) || (value%3==0)) {
            System.out.println("2또는 3의 배수이군요");
        }
        else {
            System.out.println("2또는 3의 배수가 아니군요");
        }

    }
    public void exam10(){
//        사칙연산의 축약식 ( 자바스크립트와 동일 )
        int result = 10;
//         result = result + 10
        result += 10 ;
        System.out.println("result:"+result);
        result -= 5;
        System.out.println("result:"+result);
        result *= 3;
        System.out.println("result:"+result);
        result /=5;
        System.out.println("result:"+result);
        result %=3;
        System.out.println("result:"+result);

    }
    public void exam11(){
//        3항 연산자  (  조건 ) ? 참 : 거짓
        int score = 85 ;
//        score > 90 이면 'A' , score >80 이면 'B', 아니면 'C'
        char grade = (score >90) ? 'A' : ((score >80) ? 'B' :'C');
        System.out.println( score +"점은 "+ grade + "등급입니다.");

    }
}
