package SHAPE_REORGANAZATION;


// 부모 객체
public class Shape {
  private int x;
  private int y;

  // 1. draw 메서드
  public void draw() {
      System.out.println("Shape Draw [" + x + ", " + y + "]");
  }


  // 2. getter , setter
  public int getX() {
      return x;
  }

  public void setX(int x) {
      this.x = x;
  }

  public int getY() {
      return y;
  }

  public void setY(int y) {
      this.y = y;
  }
}