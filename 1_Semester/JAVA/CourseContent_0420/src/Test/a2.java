package Test;

public class a2 extends a1{
  @Override
  public void go () {
    System.out.println("지금 재정의 한거임, 자식인 a2에서 호출함 ");
  }


  public void name() {
    System.out.println(this.a); 
    System.out.println(this.b); 
    
  } 
  public static void main(String[] args) {
    a2 foo = new a2();
    foo.go();
    
    
  }
}
