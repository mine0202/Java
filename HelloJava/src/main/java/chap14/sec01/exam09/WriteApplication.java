package chap14.sec01.exam09;

import java.io.FileWriter;
import java.io.Writer;

// 배열의 일부를 출력하기
public class WriteApplication {
    public static void main(String[] args) throws  Exception{
        Writer writer = new FileWriter("src/main/resources/test9.txt");

//        배열정의
        char[] array ={'A','B','C','D','E','F'};

//        배열을 매개변수로 전달해서 버퍼에 쓰기
        writer.write(array,2,3); // 세번째부터 3개만 출력하기

//        버퍼의 내용을 파일에 쓰기
        writer.flush();
        writer.close();
    }
}
