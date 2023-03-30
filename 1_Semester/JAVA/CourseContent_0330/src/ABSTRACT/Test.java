package ABSTRACT;

public class Test {
  public static void main(String[] args) {
    // ShapeTest s = new ShapeTest(); /
    // 클래스도 타입이다!

    Rectangle r = new Rectangle();
    Circle c = new Circle();
    Triangle t = new Triangle();

    r.draw();
    r.move(10, 20);
    c.draw();
    c.move(20, 30);
    t.draw();
    t.move(30, 40);
  }
}
