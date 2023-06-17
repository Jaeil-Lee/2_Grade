package generic;

public class Box {
   
  Object value;  // 모든 형을 받을 수 있는 Object형  -> 모든 객체를 다 넣을 수 있다- > 이래 작성하면 효율적이다 ...

  public Object getValue() {  // 모든 형을 받을 수 있는 Object형
    return value;
  }

  public void setValue(Object value) { // 모든 형을 받을 수 있는 Object형
    this.value = value;
  }
  
}


