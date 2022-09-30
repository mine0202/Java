package chap07.verify.exam04;

/**
 * packageName : chap07.verify.exam04
 * fileName : MethodApplication
 * author : ds
 * date : 2022-09-30
 * description :
 * ===========================================================
 * DATE            AUTHOR             NOTE
 * —————————————————————————————
 * 2022-09-30         ds          최초 생성
 */
public class MethodApplication {
    static void paint(Shape p){
        p.draw();
    }

    public static void main(String[] args) {
        Line line = new Line();

        paint(line);// line 의 draw 실행 "line" 출력
        paint(new Shape()); // Shape 의 draw 실행 "Shape" 출력
        paint(new Rect()); // Rect 의 draw 실행 "Rect" 출력
        paint(new Circle()); // Circle 의 draw 실행 "Circle" 출력

        Shape[] shapes = new Shape[]{new Line(),new Circle(), new Shape(), new Rect()};
        for (Shape shape : shapes){
            paint(shape);
        }

    }
}
