package chap14.sec02.exam05;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

// 프린터 보조 스트림
public class PrintApplication {
    public static void main(String[] args) throws Exception{
//      byte 기반 쓰기용으로  파일 열기
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/printstream.txt");

//        보조스트림 사용 : Print 기능 추가
        PrintStream printStream = new PrintStream(fileOutputStream);

//        파일에 글자를 쓸때 아래 함수들을 사용할 수 있음 : println(), print()
        printStream.println("[프린터 보조스트림]");
        printStream.print("마치");
        printStream.println("프린터가 출력되는 것처럼");
        printStream.println("데이터를 출력합니다.");

        printStream.flush();

        printStream.close();

    }
}
