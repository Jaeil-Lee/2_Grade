
class Point {
  private int x, y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // 부모로 부터 상속받은 메소드를 재정의 하는 것을 Overriding 이라고 한다
  @Override
  public String toString() {
    return "x:" +x + ", y:"+y;
  }

}

class Circle {
  private int radius;
  private Point p; // 멤버 변수의 자료형은 꼭 원시형일 필요는 없다, 내가 만든 class여도 된다!

  public Circle(Point p, int radius) {
    this.p = p;
    this.radius = radius;
  }

  // 부모로 부터 상속받은 메소드를 재정의 하는 것을 Overriding 이라고 한다
  @Override
  public String toString() { // public String toString(String s) 이렇게 쓰면 에러!
    return "기준점" + p + "반지름" + radius; // 상속 받을 때 부모에 인자값 있는 메소드가 없기 떄문
  }
}

public class CircleTest {
  public static void main(String[] args) {
    Point p = new Point(10, 15);
    Circle c = new Circle(p, 10);
    System.out.println(p);
    System.out.println(c);
  }
}
