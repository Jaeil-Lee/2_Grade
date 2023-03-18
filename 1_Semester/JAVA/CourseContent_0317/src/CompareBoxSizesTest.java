class CompareBoxSizes {

  private int width , length , height; 

  public CompareBoxSizes(int width, int length , int height){                  
    this.width = width;                                            
    this.length = length;                                         
    this.height = height;                                            
  }

  // 객체를 반환 값으로 갖는 메소드 생성 
  public boolean isSameBox(CompareBoxSizes obj){

    // 조건식 
    if ((width == obj.width) && (length == obj.length) && (height == obj.height) )  {
      return true; // 참
    }else{
      return false; // 거짓
    }
  }
}

public class CompareBoxSizesTest {
  public static void main(String[] args) {
    // 비교할 두 개의 객체 생성
    CompareBoxSizes FirstBox = new CompareBoxSizes(10,20,30);
    CompareBoxSizes SecondBox = new CompareBoxSizes(10,270,30);


    // 결과 출력 
    System.out.println("FirstBox == SecondBox : " + FirstBox.isSameBox(SecondBox)+" !!!");

  }
}
