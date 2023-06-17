class Car <T>{
  public T data;
  public void set(T data){
      this.data = data;
  };
  public T get(){
      return data;
  };
  public Car(T data){
    this.data = data;
  }
}

public class T2 {
  public static void main(String[] args) throws Exception {
      
      Car<String> foo = new Car<String>("렉서스 es300");
     
      System.out.println(foo.get());
      
  }
}

