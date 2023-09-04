package generic;

public class GenericTest2 {
  public static void main(String[] args) {
    // GenericPair 클래스 객체 2개 생성해서 값을 넣고 빼고 해라

    GenericPair<String,Integer> gp = new GenericPair<>("ICHIBAN",30);
    String key = gp.getKey();
    int val = gp.getValue(); // outo unboxing
    
    System.out.println(key);
    System.out.println(val);
    /* Generic 클래스의 타입 파라미터 값으로는 반드시 참조형 타입이 와야 한다.

    * 기초자료형 (Primitive type)은 절대 올 수 없다. 🔻*/
    // GenericPair<String,int> gp2 = new GenericPair<>("ICHIBAN",30);


    // 타입 파라미터로 기초 자료형의 배열은 올 수 있나❓❓❓  -> ⭕⭕⭕ 올수 있다  🔻🔻🔻🔻🔻
    int[] jumsus = {90,87,88,79,94};
    GenericPair<String,int[]> pg3= new GenericPair<>("점수임", jumsus); 
    
    for (int jumsu : jumsus) {
      System.out.println(jumsu);
    }

  }
}
