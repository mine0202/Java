package chap14.sec01.exam03;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 1byte 배열 이용하여 출력
public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        파일을 스기용(출력용)으로 열기
        OutputStream outputStream = new FileOutputStream("src/main/resources/test3.txt");

//        byte 배열
        byte[] array = { 10,20,30,40,50};

//        배열의 데이터를 버퍼에 쓰기, 배열의 시작인덱스 부터 글자 개수만큼 버퍼에 쓰기
        outputStream.write(array,1,3); //  20, 30, 40

//        버퍼 내용 파일 쓰기
        outputStream.flush();

//        파일 닫기
        outputStream.close();

    }
}
