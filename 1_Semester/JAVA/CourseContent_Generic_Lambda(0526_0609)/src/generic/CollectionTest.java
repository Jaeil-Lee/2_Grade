package generic;
import java.util.ArrayList;

/* ⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐ ArrayList 이거 시험⭐⭐⭐⭐⭐⭐⭐⭐⭐⭐   */
public class CollectionTest {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("이재일");
    names.add("김지수");
    names.add("betty");
    names.add("정유미");
    
    for(String name:names) {
      System.out.println(name);
    }

    ArrayList<Integer> ages = new ArrayList<>();
    ages.add(30);
    ages.add(30);
    ages.add(22);
    ages.add(31);

    for(Integer age:ages) {
      System.out.println(age);
    }

  }
}
