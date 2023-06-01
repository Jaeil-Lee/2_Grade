package Test;



abstract class cyusyou {
  public abstract void move();

  public void excution () {
    System.out.println("실행 합니다 ");
  };


}

class gugen1 extends cyusyou  {
  public void move () {
    System.out.println("기어갈까 걸어갈까 마  날아가자");
  }
}
class gugen2 extends cyusyou  {
  public void move () {
    System.out.println("기어갈까 걸어갈까 마  뛰어가자");
  }
}



public class q {
  

  public static void main(String[] args) {
    cyusyou a = new gugen1();
      a.excution();
  }
}