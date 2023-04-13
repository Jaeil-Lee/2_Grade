package SHAPE_REORGANAZATION;

public class Rectangle extends Shape {

  private int width;
  private int height;

  // 1. Shape의 draw 메서드 오버라이드
  @Override
  public void draw() {
      System.out.println("Rectangle Draw[" + width + ", " + height + "]");
  }

  // 2. getter , setter
  public int getWidth() {
      return width;
  }

  public void setWidth(int width) {
      this.width = width;
  }

  public int getHeight() {
      return height;
  }

  public void setHeight(int height) {
      this.height = height;
  }
}
