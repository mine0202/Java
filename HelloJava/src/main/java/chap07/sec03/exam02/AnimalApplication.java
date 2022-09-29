package chap07.sec03.exam02;

/**
 * packageName : chap07.sec03.exam02
 * fileName : AnimalApplication
 * author : ds
 * date : 2022-09-29
 * description :
 * 요약
 *      추상클래스 : 클래스들의 공통적인 속성과 함수를 추출해서 선언한 클래스를 의미
 *      목적 : 함수/ 속성의 이름을 통일하고자 할때 사용
 *      추상함수 : 추상 클래스에만 사용할 수 있고, 함수의 선언부만 있고, 실행블럭 { } 없는 함수
 *              자식클래스에서 반드시 함수 재정의(오버라이딩)해서 사용해야함
 *
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-29         ds          최초 생성
 */
public class AnimalApplication {
    public static void main(String[] args) {
//        자식 객체들 생성
       Dog dog = new Dog();
       Cat cat = new Cat();

       dog.sound();
       cat.sound();
//       다형성을 이용해서 animali.sound() 출력하세요.
       Animal animal = null;

//       dog 타입변환
        animal = new Dog();
       animal.sound(); // 멍멍

//        cat 타입변환
        animal = new Cat();
       animal.sound(); // 야옹

        System.out.println("--------------------------------------");

//        매개변수의 다형성
        animalSound(dog);
        animalSound(cat);
    }

//    공유함수
    public static void animalSound( Animal animal){
        animal.sound();
    }
}
