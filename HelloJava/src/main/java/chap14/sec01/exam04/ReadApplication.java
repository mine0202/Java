package chap14.sec01.exam04;

import java.io.FileInputStream;
import java.io.InputStream;

// 1byte 씩 파일에서 읽기
public class ReadApplication {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream("src/main/resources/test1.db");

        while(true){
//            1byte 읽기
            int data = inputStream.read(); // read() 리턴값 정수 (int )
//            파일의 끝에 도달하면 -1이 들어온다.
            if(data == -1) break;
            System.out.println(data); // 읽은 것을 화면에 출력
        }

//        파일 닫기
        inputStream.close();
    }
}
