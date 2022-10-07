package chap14.sec01.exam11;

import java.io.FileReader;
import java.io.Reader;

// 한문자씩 읽기
public class ReadApplication {
    public static void main(String[] args) throws Exception {
//         파일을 읽기용 (입력용)으로 열기
        Reader reader = new FileReader("src/main/resources/test7.txt");

//      loop 돌리면서 한 문자씩 읽기
        while (true){
//            한문자씩 읽기 - 아스키코드 로 읽힘
            int data = reader.read();
            if(data==-1) break;
            System.out.println((char)data);
        }
        reader.close();
    }
}
