package chap14.sec02.exam02;

import java.io.*;

// buffer 를 사용한것과 buffer를 안쓴것의 성능차이
// 파일복사 성능 테스트
public class NonBufferVsBufferApplication {
//    공유변수
    static int data = -1;

//    파일 copy 용 공유함수 , 리턴값 - 복사시 걸린 시간
    public static long copy(InputStream is , OutputStream os ) throws Exception {

//        걸린 시간을 체크
        long start = System.nanoTime(); // 시작시간 설정

//        복사실행
        while(true){
//            1byte 씩 데이터 읽기
            data = is.read();  // 원본 파일 읽기
            if( data == -1)break;
            os.write(data); // 새 파일에 쓰기 ( 복사본 )
        }

//        종료시간 체크
        long end = System.nanoTime();

        return (end - start); // 걸린시간
    }

    public static void main(String[] args) throws Exception{
//        원본 이미지 경로 지정
        String orgImgPath1 = "src/main/resources/images/boy.jpg";
        String orgImgPath2 = "src/main/resources/images/girl.jpg";

//        복사본 이미지 저장 경로
        String cpyImgPath1 = "src/main/resources/images/boy_copy.jpg";
        String cpyImgPath2 = "src/main/resources/images/girl_copy.jpg";

//        파일 읽기용으로 원본 이미지 열기
        FileInputStream fileInputStream1 = new FileInputStream(orgImgPath1);

//        파일 쓰기용으로 복사본 이미지 열기
        FileOutputStream fileOutputStream1 = new FileOutputStream(cpyImgPath1);

//        복사와 함께 시간 측정 : copy() 공유함수 호출
        long nonBufferTime = copy(fileInputStream1,fileOutputStream1);
        System.out.println("Buffer를 사용하지 않았을때:" + nonBufferTime+"ns");

//        파일 닫기
        fileInputStream1.close();
        fileOutputStream1.close();

//        ----------------------- 버퍼 써서 파일 복사 ---------

//        파일 읽기용으로 원본 이미지 열기
        FileInputStream fileInputStream2 = new FileInputStream(orgImgPath2);

//        파일 쓰기용으로 복사본 이미지 열기
        FileOutputStream fileOutputStream2 = new FileOutputStream(cpyImgPath2);

//        버퍼 보조스트림 new 보조스트림(기본스트림)
//        기본스트림 + 버퍼기능 추가
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream2);
        BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(fileOutputStream2);

//        복사와 함께 시간 측정 : copy() 공유함수 호출
        long BufferTime = copy(bufferedInputStream,bufferedOutputStream);
        System.out.println("Buffer 를 사용했을때   :  " + BufferTime+"ns");

//        파일 닫기
        bufferedInputStream.close();
        bufferedOutputStream.close();

    }
}
