package COMPLICATED_INHERITANCE;

// 복잡한 상속 계층 구조    Shape <-  Rectangle  


public class Rectangle extends Shape {
  private int width;
  private int height;

  public Rectangle (int x ,int y , int width ,int height) {
    super(x,y); //  super - Shape를 가르킴
    System.out.println("Rectangle()");
    this.width = width; // this - Rectangle
    this.height = height; // this - Rectangle
  }

  double calcArea() {
    return width * height;
  }
}
