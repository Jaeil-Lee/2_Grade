package OVERRIDING_OF_METHOD;
public class Dog extends Animal {

  @Override  // 부모 클래스의 메서드를 再定義!
  public void eat () {  
    System.out.println("子犬が餌を食べています。");
  }

}
