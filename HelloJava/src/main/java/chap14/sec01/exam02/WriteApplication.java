package chap14.sec01.exam02;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 1byte 배열 이용하여 출력
public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        파일을 스기용(출력용)으로 열기
        OutputStream outputStream = new FileOutputStream("src/main/resources/test2.db");

//        byte 배열
        byte[] array = { 10,20,30};

//        배열의 데이터를 버퍼에 쓰기
        outputStream.write(array);

//        버퍼 내용 파일 쓰기
        outputStream.flush();

//        파일 닫기
        outputStream.close();

    }
}
