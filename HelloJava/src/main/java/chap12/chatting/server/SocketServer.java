package chap12.chatting.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 채팅 서버 프로그램
public class SocketServer {
//     try . catch 만들기 귀찮아서 throws IOException 함.
    public static void main(String[] args) throws IOException {
        int port = 8888;  // 포트 번호

//        서버 소켓 만들기 : 매개변수 포트 8888
        ServerSocket serverSocket = new ServerSocket(port);
        while (true){
//            클라이언트의 소켓 포트정보가 서버와 일치하면 요청 받아 들이는 함수 호출
            Socket socket = serverSocket.accept();   // 무한루프로 대기중
//            socket.getInetAddress() 현재 연결된 소켓의 ip 정보 ( xxx.xxx.xxx.xxx : ip )
//            localhost == 127.0.0.1  ( 내 컴퓨터 ip )
            System.out.println("ip : "+ socket.getInetAddress()+"와 연결되었습니다.");

//           받기용(receive) 쓰레드 시작
            ReceiveThread receiveThread = new ReceiveThread(socket);
            receiveThread.start();  // run() 실행

//            보내기용 쓰레드 시작
            SendThread sendThread = new SendThread(socket);
            sendThread.start();  // run() 실행
        }
    }
}
