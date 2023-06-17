package lambda;

interface Add {
  int add(int a, int b);
}

// method 로 구현
public class RamdaTest2_method {
  
  public static int sum(int n1, int n2, int n3, Add add) {
    int result = add.add(n1, n2);
    result= add.add(result,n3);
    return result;
  }
    public static void main(String[] args) {
      
      /* 메서드 만들고  */
      System.out.println(sum(100, 100, 100, (n1,n2) -> n1+n2));
    }


}
