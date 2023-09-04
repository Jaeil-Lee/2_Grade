

interface B {
  
  void sey();
  
  
}

public class T2{
  public static void main(String[] args) {

      B b = ()->System.out.println("wdqwdqwdqwd");
      b.sey();


      B c = new B() {
        public void sey () {
          System.out.println();
        }
      };

  }
}
