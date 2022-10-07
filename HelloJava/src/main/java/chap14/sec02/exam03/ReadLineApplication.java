package chap14.sec02.exam03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

// 라인단위로 구분된 문자열
public class ReadLineApplication {
    public static void main(String[] args) throws Exception{
//        문자기반(char) 파일 읽기용으로 열기
        Reader reader = new FileReader("src/main/resources/language.txt");

//        보조스트림 : 버퍼가 있는 읽기
//        사용법 : new 보조스트림 (기본스트림)
        BufferedReader bufferedReader = new BufferedReader(reader);

//      BufferedReader 클래스의 특징 : 한 라인씩 읽기
        while (true){
            String data = bufferedReader.readLine(); // 파일을 한 라인씩 읽기
//            파일의 끝은 null
            if(data==null)break;
            System.out.println(data); // 파일 내용 출력하기
        }

        bufferedReader.close();

    }
}
