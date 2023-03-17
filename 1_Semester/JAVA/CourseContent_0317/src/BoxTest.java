class Box {
  //           幅　　　　横　　 　縦　　　　　　
  private int width , length , height;     //  👌 private int volume; // 계산해서 얻을 수 있는 값은 써도 그만 안써도 그만
 
  /* 1 */
    // 보기 편하게 이렇게 만들어 놓으면 IDE에서 값 넣을 때 보기 편하다         이렇게도 작성 가능하다 ( 똑같다 )
    public Box(int width, int length , int height){                   //  public Box(int w, int l , int h)
      this.width = width;                                             //    width = w;
      this.length = length;                                           //    length = l;
      this.height = height;                                           //    height = h;
      // volume = width * length * height;  직접 게산하는 메서드로 대체
    }
  
  /* 2 */
    //Getter
    public int getVolume() {
      return width * length * height;
    }
    
  /* 3 */  
    // 내 멤버에 하나도 접근 안해서 굳이 인스턴스 멤버일 필요 없다 , 「static」으로 하자 
    public static Box whoIsLargerBox( Box box1 , Box box2 ) {
      if (box1.getVolume() > box2.getVolume()) {
        return box1;        
      }
      // 결과인 "객체"를 반환
      return box2;
    }

}


public class BoxTest {
  public static void main(String[] args) {
    
  // 1. 첫 번째 객체 생성
    Box b1 = new Box(10, 20 , 50);
    System.out.println("첫 번째 박스의 부피 : " + b1.getVolume());
    

  // 2. 두 번째 객체 생성
    Box b2 = new Box(10, 30 , 30);
    System.out.println("두 번째 박스의 부피 : " + b2.getVolume());


  // 3. 조건문으로 결과 값을 새로운 객체에 저장 (largerBox)
    Box largerBox= Box.whoIsLargerBox(b1, b2);
    System.out.println( "결과 :" + largerBox.getVolume());

  }
}
