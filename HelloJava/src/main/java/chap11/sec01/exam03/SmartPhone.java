package chap11.sec01.exam03;

/**
 * packageName : chap11.sec01.exam03
 * fileName : SmartPhone
 * author : ds
 * date : 2022-10-04
 * description : 객체의 정보 출력하기. toString() 재정의
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */

//어노페이션 : 일종의 함수하고 비슷.
// lombok 라이브러리 @Data : @EqualsAndHashCode 등 포함.
// lombok 라이브러리 @EqualsAndHashCode  : .equals() , .hashcode() 가 미리 재정의 됨
public class SmartPhone {
    private String company;
    private String os;

//    객체의 정보 : 속성의 정보

    public SmartPhone(String company, String os) {
        this.company = company;
        this.os = os;
    }

//    .toString() 재정의
//    속성의 값을 볼수 있게 함수 재정의
    @Override
    public String toString() {
        return this.company + ","+this.os;
    }
}
