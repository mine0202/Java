package chap12.chatting.server;

// 서버용 Sender(출력용, 글자쓰기) 쓰레드

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread{
//    소켓 프로그래밍 + 쓰레드 프로그래밍
//    채팅(네트웍통신)을 위한 통로 개설 , 실시간통신가능
    private final Socket socket; // 상수 만들면 바로 값을 넣어야함 또는 생성자를 통해서.

//    scanner 입력
    private Scanner scanner = new Scanner(System.in);
//    생성자
    public SendThread(Socket socket) {
        this.socket = socket;
    }

//    쓰레드에는 run() 실행함수가 있음
    @Override
    public void run() {
        try{
//            입출력 객체 사용 : 네트웍에 기본 자료형을 사용할 수있게 만들어 주는 객체
//                   기본자료형인 int , String , double , boolean 사용할 수 있게 해주는 객체
//            입출력 기본 객체 : InputStream  , OutputStream ( 1byte 씩 입출력) 번거로움
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String sendString;
            while (true){
                sendString = scanner.nextLine(); // 채팅입력받기
                // 문자열을 네트웍 버퍼로 쏘기 ( 버퍼로 모으지 않고 계속 네트웍에 전송하면 속도가 느려짐 )
                dataOutputStream.writeUTF(sendString);
                dataOutputStream.flush(); // 진짜 네트웍 전송
            }
        }catch (IOException e){
            e.printStackTrace(); //에러코드 및 메세지를 화면에 출력
        }
    }
}
