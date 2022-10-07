package chap14.sec03.exam01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// 키보드로 부터 라인(줄) 단위 문자열 얻기
// System.in  키보드로 부터 입력
// System.out 모니터로 출력
public class GetlineKeyboardApplication {
    public static void main(String[] args) throws Exception{
//        기본스트림 byte기반 <- 키보드 입력 넣기
        InputStream inputStream = System.in;

//        byte 를 문자기반으로 연결하는 보조스트림
        Reader reader = new InputStreamReader(inputStream);  // 문자기반 보조스트림 기능 추가
//        성능향상 보조스트림 기능 추가
        BufferedReader bufferedReader = new BufferedReader(reader);  // 성능향상

//        최종 =  기본 + 문자기반 + 성능향상

        while (true){
            System.out.print("입력하세요");
//                    Buffered가 붙은 보조스트림은 .readLine() 한줄씩 읽는 함수 가능
            String lineStr = bufferedReader.readLine();
//            종료 조건
            if ( lineStr.equals("q")|| lineStr.equals("quit"))break;
            System.out.print("입력된 내용: "+ lineStr);
            System.out.println(); // 줄바꿈

        }
        bufferedReader.close();
    }
}
