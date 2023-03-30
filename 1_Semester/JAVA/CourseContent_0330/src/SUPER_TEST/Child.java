package SUPER_TEST;

public class Child extends Parent{
  public void print () {
    super.print();
    System.out.println("子のクラスの print () メソッド");
  }
  public static void main(String[] args) {
    Child childObj = new Child();
    childObj.print();
  }
}
