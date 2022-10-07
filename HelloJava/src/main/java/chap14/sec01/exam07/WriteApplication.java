package chap14.sec01.exam07;

import java.io.FileWriter;
import java.io.Writer;

public class WriteApplication {
    public static void main(String[] args) throws Exception {
        //    파일 쓰기용 ( 출력용 ) 열기 ( 문자기반 : char - 2byte)
        Writer writer = new FileWriter("src/main/resources/test7.txt");

        char a = 'A';  // 홑따옴표 한문자 표기하는 자료형
        char b = 'B';
        char c = 'C';


//        한문자씩 버퍼에 출력
        writer.write(a);
        writer.write(b);
        writer.write(c);

        writer.flush();
        writer.close();

    }

}
