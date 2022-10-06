package chap14.sec01.exam01;

import java.io.FileOutputStream;
import java.io.OutputStream;

//  1byte 씩 출력하기
//  자바 기본 입출력 객체 : InputStream ( 1byte 용 입력용, 읽기용 ), OutpotStream (1byte 용 출력용 , 쓰기용 )
//           Reader (char기반  입력용) ,Writer ( char(캐릭터, 2byte)기반 출력용 ), 최상위 클래스 (추상클래스)
//      자식 클래스 ( byte 용 ) : XXXInputStream , XXXOutputStream
//      자식 클래스 ( char 용 ) : XXXReader , XXXWriter
//    InputStream / OutputStream ( byte 기반 입출력클래스 ) : 주로 멀티미디어 (이미지, 동영상 , 등)
//    Reader / Write ( char 기반 입출력클래스 ) : 주로 텍스트 파일 등
//    자바 입출력 객체 : 디자인패턴 적용 (데코레이션(장식) 패턴)
public class WriteApplication {
    public static void main(String[] args) throws Exception {
//        파일 출력용(쓰기용) 객체 생성( 파일 열기 )
//        new FileOutputStream(경로+파일이름);
//        Gradle 프로젝트 루트(/) 경로 : build.gradle 파일 있는 위치
        OutputStream outputStream = new FileOutputStream("src/main/resources/test1.db");

        byte a = 10;
        byte b = 20;
        byte c = 30;

//        파일에 쓰기 : 먼저 버퍼(메모리, 배열)에 쓰고 버퍼가 다 차면 파일 씁니다.
//        버퍼 : 메모리의 임시공간( 입출력 / 너트웍 속도 향상을 위해 사용 )
//        .write(byte 값) : 파일버퍼에(네트웍 등 ) 쓰는 함수
        outputStream.write(a);
        outputStream.write(b);
        outputStream.write(c);

//        .flush : 버퍼에 있는 문자를 파일에 쓰기
        outputStream.flush();
//        파일 사용 끝나면 닫기
        outputStream.close();
    }
}
