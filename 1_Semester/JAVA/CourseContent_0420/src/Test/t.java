package Test;

class a {
  public void move () {
    System.out.println("a가 움직인다");
  }
}

class b extends a  {
  public void move () {
    System.out.println("b가 움직인다");
  }

  public void run () {
    System.out.println("b가 뛴다");
  }

}


public class t {
  public static void main(String[] args) {
    a w = new b();
    b ae = (b)w;
    ae.run();
  }
}
