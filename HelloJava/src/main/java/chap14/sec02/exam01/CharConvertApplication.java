package chap14.sec02.exam01;

// 보조스트림

import java.io.*;

// 자바 입출력 객체 : 데코레이션(장식) 패턴
//      a 라는 기본기능 + aa 보조기능 +... 기능을 붙일수 있는 패턴
// 보조스트림 : 다른 기본 스트림과 연결해서 여러가지 편리한 기능을 제공하는 객체
//      자체적으로 입출력을 할 수는 없음, 기본기능과 연결해서 사용해야함
public class CharConvertApplication {
//    파일 쓰기용 공유함수
    public static void write(String str) throws Exception{
//        기본 스트림 : 파일을 기본스트림 쓰기용으로 열기
        FileOutputStream fos = new FileOutputStream("src/main/resources/test1.txt");

//        1byte 쓰기용으로 열었으나 문자단위로 파일에 쓰고 싶음. 이럴때 사용하는 보조스트림 OutputStreamWriter
//        기본문자단위스트림 변수 = new 보조스트림(파일스트림변수)
//        데코레이션 패턴 사용
        Writer writer = new OutputStreamWriter(fos);  // FileOutputStream 객체 + OutputStreamWriter
//        문자를 버퍼에 출력
        writer.write(str); // 매개변수 문자열을 버퍼에 출력
//        버퍼에 출력한 것을 파일에 출력
        writer.flush();
        writer.close();
    }

//    파일 읽기용 공유함수
    public static String read() throws Exception{
//       파일을 읽기용으로 열기
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/test1.txt");

//        보조스트림기능 더하기 : new 보조스트림(기본스트림)
//        1byte 파일열기 _ 문자단위로 읽기 기능 추가 (InputStreamReader)
        Reader reader = new InputStreamReader(fileInputStream);

//        배열만들어서 읽기
        char[] buffer = new char[100];
//        readCharNum 읽은 문자개수
        int readCharNum = reader.read(buffer);  // 100문자 읽기 buffer 에 저장

        reader.close();

//        char[] 을 String 으로 바꾸기. 처음부터 읽은 문자 개수까지
        String str = new String(buffer,0,readCharNum);
        return str;
    }

    public static void main(String[] args) throws Exception{
        write("문자변환 스트림을 사용합니다."); // 공유함수 write()

        String data = read(); // 공유함수 read()
        System.out.println(data);
    }
}
