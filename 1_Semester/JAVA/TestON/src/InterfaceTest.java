
/**
 * InnerMain
 */
interface 술버릇  {
  
  String 상태 = "대대로 술버릇이 좋지 않음";

  public void 난리 ();
  static void 착함() {
    System.out.println("착하기는 졸라 착하다, 술만 안먹으면, 도덕적으로는 최고이다");
  }
  
}

class 이상열 implements 술버릇{
  String 상태 = "정말 사람이 달라짐";
  public void 난리(){
    System.out.println("술버릇 졸라 나쁘다");
  }
}
class 이재일 implements 술버릇{
  String 상태 = "그렇게 심하지는 않으나 , 조금 심각함";
  
  public void 난리(){
    System.out.println("그나마 나쁘다");
  }
  public void 어떰(){
    if (상태 != 술버릇.상태) {
      System.out.println("같지는 않음");
    }else {
      System.out.println("같음.......");
      
    }
  }
}
class 엄마 {
  술버릇 a = new 이재일();
  void 말함 () {
    System.out.println("난 언영이야");
  }
  엄마(술버릇 a){
    this.a = a;
    a.난리();
  }
}


public class InterfaceTest {
  public static void main(String[] args) {
    
   술버릇 청안 = new 술버릇(){
    public void 난리(){
      
      System.out.println("아부지 술좀 고마 잡수시소마 ");
    }
   };
   청안.난리();
    
      
  }
}
