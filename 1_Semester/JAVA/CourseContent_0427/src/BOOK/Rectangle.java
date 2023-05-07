package BOOK;

/* Comparable */
/* 
      사용자가 정의하는 것이 아니고, 표준 자바 라이브러리에 정의되어 있다.
      객체의 크기를 비교할 때 사용한다.
*/

public class Rectangle implements Comparable {
  private int width = 0;
  private int height = 0;

  @Override
  public String toString() {
    return "Rectangle [width=" + width + ", height=" + height + "]";
  }

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
    System.out.println(this);
  }

  public int getArea() {
    return width * height;
  }

  // 인터페이스의 추상 메소드를 구현
/* 
  public interface Comparable {
    int compareTo(Object other);
  }
*/
  @Override
  public int compareTo(Object other) {

    Rectangle otherRect = (Rectangle) other; // Object 타입으로 선언된 other 객체를 Rectangle 타입으로 변환
                                             // Rectangle 클래스가 Object 클래스의 하위 클래스이기 때문

    if (this.getArea() < otherRect.getArea()) {
      return -1;
    } else if (this.getArea() > otherRect.getArea()) {
      return 1;
    } else {
      return 0;
    }

    /*
     * Rectangle otherRect = (Rectangle) other;는 객체를 형 변환하는 코드입니다.
     * 
     * 인터페이스 Comparable에서 compareTo 메소드의 매개변수 other는 Object 타입입니다.
     * 그러나, 이 코드에서는 other가 Rectangle 타입의 객체임을 가정하고 있기 때문에,
     * other 객체를 Rectangle 타입으로 형 변환하고 있습니다.
     * 
     * 형 변환은 객체를 새로운 타입으로 변환하는 것을 말합니다.
     * 이 경우 Object 타입으로 선언된 other 객체를 Rectangle 타입으로 변환하고 있습니다.
     * 이를 가능하게 하는 이유는 Rectangle 클래스가 Object 클래스의 하위 클래스이기 때문입니다.
     * 
     * 따라서, 이 코드는 other 객체를 Rectangle 타입으로 변환하고, 그 결과를 otherRect 변수에 할당합니다.
     * 이제 otherRect 변수를 사용하여 Rectangle 객체의 속성 및 메소드에 접근할 수 있습니다.
     */

  }

}
