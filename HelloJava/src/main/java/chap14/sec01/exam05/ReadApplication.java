package chap14.sec01.exam05;

import java.io.FileInputStream;
import java.io.InputStream;

// 배열의 크기만큼 파일에서 읽기
public class ReadApplication {
    public static void main(String[] args) throws Exception{
        InputStream inputStream = new FileInputStream("src/main/resources/test2.db");

//        한번에 크게 읽기용 배열 크기 설정
        byte[] buffer = new byte[100];  //  100개씩 읽음

        while(true){
//            배열의 크기만큼 100 byte씩  읽기( 읽기 횟수가 줄어듬 )- 속도향상
//            .read(배열) 파일에서 읽은 데이터를 배열에 씀
//            읽은 바이트 (배열 ) 은 data 에들어감
//            읽은 데이터는 buffer 에 들어감

            int data = inputStream.read(buffer); // read(배열) 리턴값 파일에서 읽은 개수
//            파일의 끝에 도달하면 -1이 들어온다.
            if(data == -1) break;
//            읽은 바이트 수만큼 화면에 출력
            for (int i = 0; i < data; i++) {
                System.out.println(buffer[i]);
            }
        }

//        파일 닫기
        inputStream.close();
    }
}
