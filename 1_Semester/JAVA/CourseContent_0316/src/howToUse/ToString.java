package howToUse;

public class ToString {
  int x = 5;
  int y = 5;
  

  /*
    ※ toString()설명 ※
    -+`
    public String toString()은 자바의 모든 클래스에서 사용할 수 있는 메소드 중 하나이다. 
    이 메소드는 객체를 문자열로 변환하여 반환하는데 사용된다

    보통 이 메소드를 오버라이드하여 자신이 만든 클래스에서 객체를 문자열로 표현하는 방법을 정의한다.
    이렇게 정의한 toString() 메소드는 객체를 출력하거나 디버깅할 때 유용하게 사용될 수 있다.

    toString() 메소드는 Person 클래스의 인스턴스를 문자열로 반환한다.
    이렇게 반환된 문자열은 System.out.println() 메소드를 통해 콘솔에 출력할 수 있다. 
   */

  @Override
  public String toString(){   
    return "x:" +x + ", y:"+y;    
  }


  public static void main(String[] args) {
    ToString obj = new ToString();
    System.out.println(obj);
  }
}
