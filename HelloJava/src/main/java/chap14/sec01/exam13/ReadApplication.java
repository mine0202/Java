package chap14.sec01.exam13;

import java.io.FileReader;
import java.io.Reader;

// 배열의 지정한 길이 만큼 읽기
public class ReadApplication {
    public static void main(String[] args) throws Exception {
//         파일을 읽기용 (입력용)으로 열기 ( 문자기반 )
        Reader reader = new FileReader("src/main/resources/test9.txt");

//        배열의 정의
        char[] buffer = new char[5];

//           파일에서 읽은 문자를 배열에 쓰기 : 3번째 인덱스 부터 글자 3개를 쓰기
            int readCharNum = reader.read(buffer,2,3);

//            파일의 끝이 아니라면 글자를 화면에 출력하기
        if( readCharNum != -1){
            for (int i = 0; i < buffer.length; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();
    }
}
