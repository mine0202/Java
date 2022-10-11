package jungsuk.chap12;



import java.util.ArrayList;
import java.util.Objects;


// 제네렉스 <>  : 객체의 자료형을 제한할 목적으로 사용
//              자료구조와 같이 많이 사용함

class Product{}

class Tv extends Product{
    String name = "낙수 Tv";

//    getter 속성의 값을 반환하는 함수
    public String getName() {
        return name;
    }

//    intellij 에서 만든 equals , hashcode 재정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return Objects.equals(name, tv.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class  Audio extends Product{
    String name = "낙수 Audio";

    public String getName() {
        return name;
    }
}


public class Ex12_1 {

//    실행함수
    public static void main(String[] args) {
        ArrayList<Product> productArrayList = new ArrayList<>();  // Product 객체만 들어감
//    ArrayList<Product> productArrayList = new ArrayList<Product>();  위와 같음
//    ArrayList<Product> productArrayList = new ArrayList<Tv>();  제네릭은 부모, 자식 다형성은 안됨
//        List<Tv> tvList2 = new ArrayList<>(); 이런 다형성은 가능

        ArrayList<Tv> tvArrayList = new ArrayList<>();

//        .add() : 자료형이 Product 뿐만 아니라 자식클래스도 가능
        productArrayList.add(new Tv());
        productArrayList.add(new Audio());

//        tv의 속성 / audio 속성 출력
        Tv tv = (Tv)productArrayList.get(0);  // 강제형변환, 원복
        Audio audio = (Audio)productArrayList.get(1);
        System.out.println("list 0번:"+ tv.name);
        System.out.println("list 1번:"+ audio.name);

//        Tv 자식클래스 제네릭 걸린 ArrayList
        tvArrayList.add(new Tv());
//        tvArrayList.add(new Product());  안됨

//        공유함수의 매개변수로 전달
        printAll(productArrayList);
//        printAll(tvArrayList); // 제네릭이 걸린 매개변수에 전달 못함, 에러

    }

//    공유함수
    public static void printAll (ArrayList<Product> list){
        for ( Product p : list){
            System.out.println(p);
        }
    }
}
