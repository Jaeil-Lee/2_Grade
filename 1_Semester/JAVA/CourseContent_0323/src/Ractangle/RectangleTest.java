package Ractangle;

/* 도형 예제  */


public class RectangleTest {
  public static void main(String[] args) {
    Rectangle r1 = new Rectangle();
    Rectangle r2 = new Rectangle();


    // 부모 class에서 작성한 메서드도 접근해서 사용가능하다! 
    r1.setX(5);
    r1.setY(3);
    r1.setWidth(10);
    r1.setHeight(20);


    r2.setX(8);
    r2.setY(9);
    r2.setWidth(10);
    r2.setHeight(20);

    r1.print();
    r1.draw();
    r2.print();
    r2.draw();



  }
}
