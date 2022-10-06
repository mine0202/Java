package chap11.sec02.exam06;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

// 아이디와 비밀번호 검사하기
//    Map : 인터페이스 , 구현클래스 ( HashMap, HashTable )
//    HashTable : 멀티쓰레드( 프로그램 내에서 각각 비동기적으로 실행되는 것) 환경에서 사용
//        동기화 문제 : 프로그램 순서가 바뀔경우 이상한 결과가 나오는 것
//        HashTable 을 사용하면 자동 동기화가 되어 동기화 문제가 생기지 않음
// HashMap 과 HashTable 사용법 거의 유사함
public class HashTable {
    public static void main(String[] args) {
//        <> 제너릭( Generic), 객체타입제한
        Map<String, String> map = new Hashtable<>();

//        아이디와 비밀번호 미리 저장  : (키 , 값 ) 자료구조
        map.put("spring","12");
        map.put("summer","123");
        map.put("fall","1234");
        map.put("winter","12345");

//        키보드 입력 : System.in - 키보드를 말함, System.out - 모니터를 말함
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("아이디와 비밀번호를 입력해주세요");
            System.out.print("아이디: ");
//            입력받기
            String id = scanner.nextLine();
            System.out.print("비밀번호: ");
//            .nextLine() : 한줄 입력받기
//            .next()  : 공백을 기준으로 한 단어 입력받기
            String password = scanner.nextLine();

            System.out.println(); // 줄바꿈

//            id 와 password 가 존재하는지 확인
//            containsKey(키) : 키가 있으면 true , 없으면 false
            if ( map.containsKey(id)){
//                아이디가 키에 존재하면.. password 확인
//                .get(키) : return 값은 map 의  key 에 해당하는 value 나옴.
//                String 이므로 .equals 를 사용하여 비교함
                if (map.get(id).equals(password)){
                    System.out.println("로그인 되었습니다.");
                    break;
                }else {
                    System.out.println("비밀번호가 다릅니다.");
                }
            } else {
                System.out.println("id 가 존재하지 않습니다.");
            }
        }
    }
}
