import java.util.ArrayList;

class 엄망<T> {
  public T 이름;
}



public class ArrayListTest {
  public static void main(String[] args) {
    
    ArrayList<String> 변수 = new ArrayList(); // 제네릭
    // ArrayList 변수 = new ArrayList();  일반적인 모습 ( 제네릭 사용 ❌)

    변수.add("일");
    변수.add("이");
    변수.add("삼");

    for (int i = 0; i < 변수.size(); i++) {
        String value = 변수.get(i);
        System.out.println(value);
    }

    엄망<String> 은영 = new 엄망<String>();
    

  }
}
