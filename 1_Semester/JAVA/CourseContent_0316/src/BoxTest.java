class Box {
  private int width;
  private int length;
  private int height;
  private int volume;

  // volume get 메소드
  public int getVolume(){
    return volume;
  }
  
  // Box 생성자
  Box (int width , int length, int height) {
    this.width = width;
    this.length = length;
    this.height = height;
    volume = width + length * height;
  }
}

public class BoxTest {
  public static void main(String[] args) {
    Box boxObj;
    boxObj = new Box(20,20,30);
    System.out.println("상자의 부피는 " + boxObj.getVolume() + "입니다");
  }
}
