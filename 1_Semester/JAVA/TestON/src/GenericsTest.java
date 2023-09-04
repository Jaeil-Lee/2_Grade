
class 엄망 <T,S> {
  T 잔다;
  S 묵는다;
  엄망(T 잔다, S 묵는다 ){
    this.잔다=잔다;
    this.묵는다=묵는다;
  }
}

public class GenericsTest {
  public static void main(String[] args) {
    Integer 숫자변환 = Integer.valueOf(58);
    엄망<String,Integer> 은영 = new 엄망<String,Integer>("맨날잔다",2);
    System.out.println(은영.묵는다);
  }
}
