package chap10.sec01.exam04;

/**
 * packageName : chap10.sec01.exam04
 * fileName : ClassCaseApplication
 * author : ds
 * date : 2022-10-04
 * description : Class Cast Exception
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class ClassCastApplication {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog); // 가능


//        원인 : animal 에는 Dog 변환할수 없음
        Cat cat = new Cat();
        changeDog(cat);  // 예외발생 Class Cast Exception
    }

//    공유함수
    public static void changeDog(Animal animal){
        Dog dog = (Dog)animal;
    }

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
