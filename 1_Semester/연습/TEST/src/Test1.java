interface Car {
  void seppd (int km);
  void airbag (Boolean onoff);
  String star (String b);
  
}

class Bmw implements Car {
    Bmw(String version){
      System.out.println(version+"입니당");
    }
    public void seppd (int km){
      System.out.println("이차의 시속은"+km+"입니다");
    };
    public void airbag (Boolean onoff) {
      System.out.println(onoff);
    };
    public String star (String s) {
      return  s;
    }
    public void brake () {
        System.out.println("브레이끼 끼익!");
    };
    
 }

public class Test1  {
  public static void main(String[] args) {
    Car b = new Bmw("520d");
    b.seppd(50);   
    // b.brake();   
  }
}
