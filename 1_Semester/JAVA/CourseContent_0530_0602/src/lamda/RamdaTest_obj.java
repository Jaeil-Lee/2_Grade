package lamda;

public class RamdaTest_obj {
  // 객체로 만들어서  로 구현
  public static void main(String[] args) {
      SumFunction sumFunction = new SumFunction();

      int n1 = 1;
      int n2 = 2;
      int n3 = 3;

      int result = sumFunction.sum(n1, n2, n3, (a, b) -> a + b);
      System.out.println(result);
  }
}

// function sum(n1,n2,n3,add) {
//   let result = add(n1,n2);
//   result = add(result,n3);
//   console.log(result);
//   return result;
// }


// 타입으로 사용할 인터페이스
interface Add {
  int add(int a, int b);
}

class SumFunction {
  public int sum(int n1, int n2, int n3, Add add) {
      int result = add.add(n1, n2);
      result = add.add(result, n3);
      return result;
  }



}
