public class Test5  {
  public static void main(String[] args) {
    InnerTest5 f = (a,b)-> a + b;

    System.out.println(f.max(5,5));
    

    fi 변수 = ()->System.out.println("이기 람다다");
    변수.minus();



    ichi foo = new ichi();
    foo.copy(()->System.out.println("zzzzzz"));



  }
}


@FunctionalInterface 
interface InnerTest5 {
  int max(int a, int b);
  
}


@FunctionalInterface /* 함수형 인터페이스 */
interface fi {
  void minus();
  
}


class ichi {
  int age;
  String name;

  void copy (fi f) {
    f.minus();
  }


}

