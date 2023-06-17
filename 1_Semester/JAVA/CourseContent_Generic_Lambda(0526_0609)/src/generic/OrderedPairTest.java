package generic;

import javax.print.attribute.IntegerSyntax;

class OrderedPair<K,V> {
  private K key;
  private V value;

  public OrderedPair(K key , V value){
    this.key = key;
    this.value = value;
  }

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

 
}

public class OrderedPairTest {
  public static void main(String[] args) {
      OrderedPair<String ,Integer> p1 = new OrderedPair<>("ichiban", 94);
      OrderedPair<String ,String> p2 = new OrderedPair<>("ichiban", "hasegawa");
      System.out.println(p1.getKey()+" " + p1.getValue());
      System.out.println(p2.getKey()+" " + p2.getValue());

  }
}
