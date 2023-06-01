package SHAPE_REORGANAZATION;

public class ShapeTest {
  public static void main(String[] args) {
     
     // 부모형으로 자식 생성
      Shape shape1 = new Shape();
      // s2의 타입은 shape 이지만 s2가 실제로 가리키고 있는 객체 타입이 Rectangle 이라서 Rectangle의 draw() 가 호출 된다
      Shape shape2 = new Rectangle();
      Shape shape3 = new Triangle();
      Shape shape4 = new Circle();

      // 부모의 메서드 구현
      shape1.draw();
      shape2.draw();
      shape3.draw();
      shape4.draw();
  }
}