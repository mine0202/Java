package chap11.sec02.exam06;

//Map 인터페이스, 구현클래스 HashMap, HashTable, LinkedHashmap , Properties등

// Map 인터페이스 , 키와 값으로 구성된 자료구조(  (키,값) : Entry )
//    키 : 유일 ( 중복되면 안됨 )
//    값 : 중복허용
//    동일한 키 값으로 저장하면 기존 값을 대치해서 저장됨

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapApplication {
    public static void main(String[] args) {
//        Map 자료구조 생성
        Map<String, Integer> map = new HashMap<>();

//        map객체.put(키,값)  : 객체추가
        map.put("이수리", 75);
        map.put("홍길동", 60);
        map.put("강장군", 90);
        map.put("홍길동", 95);

//        map 객체 크기보기
        System.out.println("총 Entry 수 : "+ map.size());

//        Entry 보기
//         키 가 "홍길동" , 중복 입력하여 마지막 95 출력
        System.out.println("홍길동 : "+ map.get("홍길동"));

        System.out.println("----------------------");  // 줄바꿈

//        객체를 뽑아서 출력하기
        Set<String> keySet = map.keySet();  // Map 을 Set 변환 : 키만 있는 집합이됨.
//        반복문을 실행할때 Iterator 객체 이용하면 간편해짐.
        Iterator<String> keyIterator = keySet.iterator();  // Iterator 로 변환
//        keyIterator.hasNext()  : keyIterator 객체 안에 값이 있으면...
        while (keyIterator.hasNext()){
//            1st 첫번째 사용 .next() 호출 : 최초 자료
//            2nd 두번재 사용 .next() 호출 : 두번재 자료
//            ...
//            nth .next() 호출 : n번재 자료
            String key = keyIterator.next(); // 그 값을 임시 key 변수에 넣기
            Integer value = map.get(key);  // 키로 값을 조회
            System.out.println(key + " : "+ value);
        }
        System.out.println("----------------------");  // 줄바꿈

//        자료 삭제
        map.remove("홍길동");
        System.out.println("총 Entry 수 : "+ map.size());

//        자료 모두 삭제
        map.clear();
        System.out.println("총 Entry 수 : "+ map.size());
    }
}
