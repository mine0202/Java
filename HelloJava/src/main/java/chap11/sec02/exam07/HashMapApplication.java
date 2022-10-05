package chap11.sec02.exam07;

import java.util.HashMap;
import java.util.Map;

/**
 * packageName : chap11.sec02.exam07
 * fileName : HashMapApplication
 * author : ds
 * date : 2022-10-05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */
    public class HashMapApplication {
        public static void main(String[] args) {
            Map<Student, Integer> map = new HashMap<>();

    //        재정의 되어있으면 한건만 들어감.
            map.put(new Student(1,"홍길동"), 95);
            map.put(new Student(1,"홍길동"), 95);

            System.out.println("총 Entry 수 : "+ map.size());
        }
    }
