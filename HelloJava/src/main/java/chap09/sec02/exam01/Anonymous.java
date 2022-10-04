package chap09.sec02.exam01;

/**
 * packageName : chap09.sec02.exam01
 * fileName : Anonymous
 * author : ds
 * date : 2022-10-04
 * description : 익명클래스의 사용법
 * 요약 :
 *      익명 자식 객체 : 자식 클래스가 재사용되지 않고 , 특정 위치에서 1번만 사용될 경우
 *                  자식클래스를 만들지 않고 익명 객체를 사용하는 것이 더 좋음
 *                  익명객체 생성자는 만들지 않음.
 *                  사용법 : 부모클래스 객체변수 = new 부모클래스(매개변수..){
 *                                          //속성
 *                                          //함수
 *                                           };
 *
 *       익명 구현(자식) 객체 : 구현(자식) 클래스가 재사용되지않고, 특정위치에서 1번만 사용될경우
 *              구현(자식)클래스를 만들지 않고 익명 객체를 사용하는 것이 더 좋음
 *              사용법 : 인터페이스 인터페이스변수 = new 인터페이스 () {
 *                                          // 재정의 함수
 *                                          // 속성
 *                                          };
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-10-04         ds          최초 생성
 */
public class Anonymous {
//    1) 일반 속성에 익명 객체 사용
//    Composition(구성, 집합) : 다른 클래스에있는 속성이나 객체를 불러서 사용 - 상속과 비슷.
//    { } 안에 있는 것이 익명 객체
//    사용법 :
//           부모클래스 객체변수 = new 부모클래스() { 자식클래스 };

    Person field = new Person(){   // Person 이 부모객체가 되고. { } 안에있는 것이 상속받는데 이름이 없음...
        void work(){
            System.out.println("출근합니다.");
        }

//        함수 재정의 가능
        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

//    함수의 로컬 변수에 사용가능
    void method1(){
//        지역(로컬) 변수값으로 익명 객체 대입
        Person localVar = new Person(){
            void walk(){
                System.out.println("산책합니다.");
            }

            //        함수 재정의 가능
            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };
        localVar.wake();  // 지역변수(Person 객체)의 함수 호출
    }

    void method2(Person person){
        person.wake();
    }
}
