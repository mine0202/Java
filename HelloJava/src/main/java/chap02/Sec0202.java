package chap02;

public class Sec0202 {
    public void exam01(){
        int var1 = 0b1011; // 2진수 ( 0b 를 붙이면 2진수가 됨.)
        int var2 = 0206; //8진수 ( 앞에 0을 붙이면 8진수 )
        int var3 = 365; // 10진수
        int var4 = 0xB3; // 16진수 ( 앞에 0x 를 붙이면 16진수 )

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
//    접근자  반환되는 자료형
    public void exam02(){
//        int (4byte 정수형) , byte(1byte 정수형) byte 는 길이가 짧은 정수형.
        byte var1 = -128 ;
        byte var2 = -30 ;
        byte var3 = 0 ;
        byte var4 = 127 ;
//        byte var5 = 128 ;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);

    }
    public void exam03(){
//        long ( 8byte 정수형 )
        long var1 = 10; // int 형 -> long 변환
        long var2 = 20L;   // L 이 long 형이라는 것을 알려줌.
        long var3 = 1000000000000000000L;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }

    public void exam04(){
//         문자형 : 1개의 문자를 저장하는 자료형
//        문자열형 : 1개 시상의 문자를 저장하는 자료형
        char c1 = 'A'; // 1개의 문자 저장 ( 홑따옴표 사용 )
        char c2 = 65; // 10진수를 넣으면 문자로 자동 변환됨 ( 아스키코드에 있으면 )
        char c3 = '\u0041';  // 유니코드 숫자가 문자로 자동 변환됨 ( 백슬래쉬 u 를 앞에 넣어야함 )
        char c4 = '가';
        char c5 = '\uac00';  // 유니코드 숫자가 문자로 자동 변환 - '가'

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
    }

    public void exam05(){
//        string 문자열 자료형
        String name = "홍길동";
        String job = "프로그래머";
// 줄바꿈 안하고 출력함 ln 없음
// 자동 줄바꿈하고 출력함 ln 있음
        System.out.println(name);
        System.out.print(job);
        System.out.print(job);
    }
    public void exam06(){
//        \t 는 tap 효과 4칸정도
//        \n 은 줄바꿈
//        " 쌍따옴표 안에 " 쌍따옴표를 넣고 싶을때 \"를 한다.
//        \ 이스케이프 문자  문자열 안에 ", \ 를 넣고 싶을때 사용
        System.out.println("번호\t이름\t직업");
        System.out.print("행 단위 출력 \n");
        System.out.print("행 단위 출력 \n");
        System.out.println("우리는 \"개발자\" 입니다.");
        System.out.println("봄\\여름\\가을\\겨울");

    }

    public void exam07(){
//         실수형  float 실수형을 나타내기 위해서 뒤에 f 를 붙임 (4byte )
        float var2 = 3.14f;
//        double 소수점 포함 숫자 ( 8byte )
        double var3 = 3.14;
        float var4 = 0.12345678901234f;
        double var5 = 0.1234567890123456789;
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
    }

    public void exam08(){
//         boolean  : 참, 거짓을 저장하는 자료형,
        boolean stop = true;
        if(stop){
            System.out.println("중지합니다.");
        }
        else {
            System.out.println("시작합니다.");
        }
    }

//    자료형 요약 : int(정수) , String(문자열) , double(실수) , boolean(참/거짓)
}
