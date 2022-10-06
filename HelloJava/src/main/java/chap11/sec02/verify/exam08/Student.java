package chap11.sec02.verify.exam08;

/**
 * packageName : chap11.sec02.verify.exam08
 * fileName : Student
 * author : ds
 * date : 2022-10-06
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-06         ds          최초 생성
 */
public class Student {
    public int studentNum;
    public String name;

    public Student (int studentNum, String name) {
        this.studentNum = studentNum;
        this.name = name;
    }

//    학번만 return 하게 함수 재정의 : 같은 객체로 취급
    @Override
    public int hashCode() {
        return this.studentNum;
    }

//    객체의 최고 조상클래스 Object
    @Override
    public boolean equals(Object obj) {
//        obj 가 Student 인지 확인해서 강제 형변환.
        if(obj instanceof Student){
            Student student = (Student) obj;
//            학번만 같은지 비교해서 같으면 true 아니면 false
            return  this.studentNum==student.studentNum;
        }
        else {
            return false;
        }
    }
}
