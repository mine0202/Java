package chap02;

public class Sec0203 {
//    속성 생략
//    함수 ( 메소드 )
    public void exam01(){
//        자동 형변환 형태
//        int ( 4byte 정수형 ) <- byte (1byte 정수형 ) = int(4byte 정수형)  자동바뀜
//         같은 정수형이고 길이만 다를 경우 자동형변환이 가능함.
        byte byteValue = 10;
        int intValue = byteValue;

        System.out.println("intValue : "+ intValue);

        char charValue = '가';
//         한 문자 를 int 로 넣으면 유니코드 (숫자) 자동 변환
        intValue = charValue ;
        System.out.println("intValue : "+ intValue);

//        long ( 8byte 정수 ) 에 int 형 넣기 자동 변환됨.
        intValue = 50;
        long longValue = intValue;
        System.out.println("intValue : "+ intValue);

//        float 실수형  에 정수형 : 자동 float 실수형이 됨.
        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : "+ floatValue);

//        double (8byte ) 실수형 에 float(4byte) 실수형  : double 실수형이 됨
        floatValue = 100.5f;
        double doubleValue = floatValue;
        System.out.println("doubleValue : "+ doubleValue);
    }

    public void exam02(){
//         char(2byte) 와 int(4byte)
        int intValue = 44032;
//        캐스팅 연산자(형변환 연산자) : (바꿀자료형)
        char charValue = (char)intValue;
        System.out.println(charValue);

//        int ( 4byte ) , long (8byte) : 캐스팅 연산자로 변환해야함. (바꿀자료형)
        long longValue = 500l;
        intValue = (int)longValue;
        System.out.println(intValue);

//        int (4byte) , double(8byte) : 캐스팅 연산자로 변환해야함.
        double doubleValue = 3.14;
        intValue = (int)doubleValue;
        System.out.println(intValue);


    }

    public void exam03(){
//        byte(1byte) 정수형,
//        내부적으로 byte + byte 하면 int 가 됨.
        byte result1 = 10 +20;
        System.out.println(result1);

        byte x  = 20;
        byte y  = 10;
        int result2 = x+y;
        System.out.println(result2);

//        정수 자료형 모두 사용하기
        byte value1 = 10;
        int value2 = 100;
        long value3 = 10000l;
//        byte + int + long 하면 long 가 됨.
        long result = value1 + value2 + value3 ;
        System.out.println(result);

        int x1=1;
        int y1 =2 ;
        double result10 = (double) x1/y1;
        System.out.println(result10);

    }

    public void exam06(){
//        문자열 + 숫자 = 문자열
        int value = 10 +2 +8 ;
        System.out.println(value);

        String str4 = "10" + (2+8) ;
        System.out.println(str4);
    }

    public void exam07(){
//        숫자문자열 -> 숫자 변환시키는 함수
        int value1 = Integer.parseInt("10");
        double value2 = Double.parseDouble("3.14");
        boolean value3 = Boolean.parseBoolean("true");


//        숫자를 문자열로 바꾸는 함수
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(3.14);
        String str3 = String.valueOf(true);

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }

}
