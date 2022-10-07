package chap14.sec01.exam12;

import java.io.FileReader;
import java.io.Reader;

// 배열의 길이 만큼 읽기
public class ReadApplication {
    public static void main(String[] args) throws Exception {
//         파일을 읽기용 (입력용)으로 열기 ( 문자기반 )
        Reader reader = new FileReader("src/main/resources/test8.txt");

//        배열의 정의
        char[] buffer = new char[100];

//      loop 돌리면서 파일에서 글자 읽기
        while (true){
//            배열 길이만큼 읽기
            int readCharNum = reader.read(buffer);
//            파일을 읽어서 배열에 (buffer) 저장 : 100문자를 배열에 저장
            if(readCharNum==-1) break;
            System.out.println(buffer);  // 남은 공간은 공란으로 표시되어 다음과 같이 for 문을 사용함

            for (int i = 0; i < readCharNum; i++) {
                System.out.println(buffer[i]);
            }
        }
        reader.close();
    }
}
