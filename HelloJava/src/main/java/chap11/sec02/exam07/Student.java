package chap11.sec02.exam07;

/**
 * packageName : chap11.sec02.exam07
 * fileName : Student
 * author : ds
 * date : 2022-10-05
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-05         ds          최초 생성
 */

//  Model ( 정보저장을 목적으로 만든 순수한 객체 )  , 업무로직 저장한 클래스 ( Service )
//    화면을 모바일 , 웹브라우저 , 등을 상황에 맞게 돌려주는 클래스 ( Controller )
//    화면에 표시만 할 클래스 ( View )
//    업무에 맞게 각각 클래스를 분리함.

public class Student {
    public int sno; //학번
    public String name; // 이름

    public Student(int sno, String name) {
        this.sno = sno;
        this.name = name;
    }

//    equals() , hashcode() 재정의

    @Override
    public int hashCode() {
        return name.hashCode() + sno;
    }

    @Override
    public boolean equals(Object obj) {
        if ( obj instanceof Student){
            Student student = (Student) obj;
            return (this.name.equals(student.name)) && ( this.sno == student.sno);
        }
        else {
            return false;
        }
    }
}
