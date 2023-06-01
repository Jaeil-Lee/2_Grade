package STATICOVERRIDING;

public class Cat extends Animal{

  //  overriding 는 인스턴스 메소드만 사용할 수 있다.
  //  정적 메소드를 overriding하는 것은 아무 의미가 없다 
  public static void eat(){
    System.out.println(" 고양이가 쯔왑쯔왑");
  }

    @Override 
    public void sound() {
      System.out.println("고양이가 소리를 낸다 : 야옹~");
    }
}
