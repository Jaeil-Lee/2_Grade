package generic;


/* 이렇게 하면 여러 종류를 받을 수 있다. */
public class GenericPair<T,V> {

  private T key;
  private V value;

  public GenericPair (T key,V value) {
    this.key = key;
    this.value = value;
  }

  public T getKey() {
    return key;
  }
 
  public V getValue() {
    return value;
  }


}
