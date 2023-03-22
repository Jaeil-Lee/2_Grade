/* 정적 멤버 */

class Car {

  // 변수
  // 모든 멤버는 instance 멤버
  private String model;
  private String color;
  private int speed;

  // 자동차의 시리얼 넘버
  private int id;
  private static int numbers = 0; // 정적 멤버 변수로 만들어서, 모든 인스턴스가 이 변수를 공유하도록 하자:❗

  /*  
    상수란（常数）? : 한번 초기화되면 절대 값을 변경할 수 없는값
      🟡 자바에서는 상수를 어떻게 만드나?  final keyword 사용 , 대문자로 작성하는 것이 관례
      🟡 자바에서 상수인 경우 static을 붙여 정적으로 만드는 것이 바람직하다 
      🟡 상수는 일반적으로 public으로 선언한다
      */
  public static final int MAX_SPEED; // 상수도 초기화 블록에 넣어서 사용할 수 있다  final필드는 반드시 초기화를 시키고 사용해야 한다
    
      
  // 1. static 메소드 블록은 젤 먼저 실행
  static {
    MAX_SPEED =350;
    System.out.println("나는 static 초기화 블록 , 딱 한번 실행된단다!! , 1번째 출력");
  }
  

  // 2. 기본 초기화 블록 
  {
    System.out.println("나는 그냥 초기화 블록 , 2번째 출력");
    
    model = "G80";
    color = "blue";
  }


  // 3. 생성자 ( 생성자 앞에 별일 없으면 public 붙이기)
  public Car (String argModel , String argColor , int argSpeed){
    System.out.println("나는 생성자 , 3번째 출력");
    id = ++numbers; // 자동차의 개수를 증가하고 id 에 대입 [전위 형]

    this.model = argModel;
    this.color = argColor;
    this.speed = argSpeed;
    // MAX_SPEED = 5  이렇게 상수를 변경 불가!! error!!!
  }

    // static method가 맞나 ? instance method로 구현하는 것이 맞나?  : static
    // static method는 instance method를 호출할 수 있다 없다? : 없다
    // private를 붙였기 때문에 외부에서 접근 불가함으로 get 메소드를 만든다
    public static int getNumbers() {   // => static을 붙였기 때문에  Car.getNumbers() 이렇게 가능하다 
      return numbers;
    }



  // instance method : instance가 생성되어야만 존재하는 메소드
  public void print (){
    System.out.println("마 나는 instance 메서드라고, static은 나를 몬건드린다꼬 !");
  }

}

public class CarTest {
  public static void main(String[] args) {
    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------");
    Car c1 , c2 ,c3;
    
    c1 = new Car ("s600","white",80);
    c2 = new Car ("E500","blue",20);
    c3 = new Car ("E300","gray",160);


    System.out.println("생성된 자동차 수 : " +c1.getNumbers()  );  // Car.getNumbers()
    System.out.println("생성된 자동차 수 : " +c2.getNumbers()  );  // Car.getNumbers()
    System.out.println("생성된 자동차 수 : " +c3.getNumbers()  );  // Car.getNumbers()

    // c3.numbers =5 ;
    // System.out.println(c3.numbers);

    // 13번 라인에 static을 붙였기 때문에 


    /* 자바의 수학관련 라이브러리 클래스는 정적 메서드를 이용 */
    // java lang패키지에 뭐가 많다 거의 다들어 있다.
    // System.out.println(Math.sqrt(9));  

    
  }
}
