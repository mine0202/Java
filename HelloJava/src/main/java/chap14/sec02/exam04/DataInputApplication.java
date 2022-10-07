package chap14.sec02.exam04;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 기본자료형 (타입)으로 입출력하기
public class DataInputApplication {
    public static void main(String[] args) throws Exception{
//        byte 단위 파일 쓰기용으로 열기
        FileOutputStream fileOutputStream = new FileOutputStream("src/main/resources/primitive.txt");

//        보조스트림 사용 : 기본자료형을 사용할 수 있게 함
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

//        버퍼에 쓰기
        dataOutputStream.writeUTF("홍길동");
        dataOutputStream.writeDouble(95.4);
        dataOutputStream.writeInt(123);

        dataOutputStream.writeUTF("이가자");
        dataOutputStream.writeDouble(90.5);
        dataOutputStream.writeInt(223);

//      파일에 쓰기
        dataOutputStream.flush();
//      파일 닫기
        dataOutputStream.close();


//        ---------------파일 읽기 --------------
//        파일에 쓴 자료형 순서를 마추어서 읽어야함 : 자료형마다 byte 크기가 다름

//        파일 열기
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/primitive.txt");

//        보조스트림사용
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);

//        파일 출력 , 출력순서  문자열 -> double -> int : 문자열  -> double -> int
        for (int i = 0; i < 2; i++) {
            String name = dataInputStream.readUTF(); // 파일에서 문자열로 읽기
            double score = dataInputStream.readDouble(); // 파일에서 문자열로 읽기
            int order = dataInputStream.readInt(); // 파일에서 문자열로 읽기

            System.out.println( name + ": "+score+" : "+order);
        }

//        파일닫기
        dataInputStream.close();
    }
}
