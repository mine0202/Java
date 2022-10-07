package chap14.sec01.exam10;

import java.io.FileWriter;
import java.io.Writer;

// 문자열 출력하기
public class WriteApplication {
    public static void main(String[] args) throws  Exception{
//        파일열기 문자기반
        Writer writer = new FileWriter("src/main/resources/test10.txt");

//        문자열에 저장
        String str = "ABCDE";

//        문자열 전체를 버퍼에 쓰기
        writer.write(str);

//        버퍼의 내용을 파일에 쓰기
        writer.flush();
        writer.close();
    }
}
