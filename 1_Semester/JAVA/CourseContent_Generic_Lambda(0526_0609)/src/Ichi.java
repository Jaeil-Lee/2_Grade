class Car <T>{
    public T data;
    public void set(T data){
        this.data = data;
    };
    public T get(){
        return data;
    };
   
}

public class Ichi {
    public static void main(String[] args)  {
        
        Car<String> foo = new Car<String>();
       
        foo.set("렉서스 es300");
        System.out.println(foo.get());
        
    }
}

