package chap12.chatting.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

//글자받기(Receiver) 쓰레드
public class ReceiveThread extends Thread{
//    네트워크 통신 소켓 속성
    public final Socket socket; // 상수 값 설정

//    생성자
    public ReceiveThread(Socket socket) {
        this.socket = socket;
    }

//    run() 함수 작성
    @Override
    public void run() {
        try{
//            네트웍 기본 1byte 통신 -> 기본 데이터형 사용할 수 있게 하는 객체 사용
//            입력용 (데이터 받기 ) : InputStream 객체
//            출력용 (데이터 쓰기 ) : OutputStream 객체
//            네트웍 동시에 Input / Output 할수 없음, 하나씩 코딩
            DataInputStream dataInputStream =
                    new DataInputStream(socket.getInputStream());
            String receiveString;
            while (true){
//                .readUTF() 문자열로 받기
                receiveString = dataInputStream.readUTF(); // 네트웍 전송 데이터 받기
                System.out.println("상대방 : "+ receiveString); // 상대방 메시지 모니터 출력
            }
        }catch(SocketException e1) {
            System.out.println("상대방 연결이 종료되었습니다.");
        }catch (IOException e2){
            e2.printStackTrace(); // 에러코드 및 에러메세지 화면 출력
        }
    }
}
