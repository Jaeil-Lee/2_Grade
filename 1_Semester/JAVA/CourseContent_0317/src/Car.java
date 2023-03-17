
public class Car {
  private int speed;
  private String name;

  static int counter ;

  // 인스턴스 초기화 블록 (Instance initialization block) => 인스턴스 변수를 초기화 

  // 🟡 초기화 블록은 자동으로 생성자에게 카피가 된다   
  // 🟡 생성자의 가장 처음으로 copy된다 
/* 
   ※ 공통적으로 실행되는 초기화 블록 ※
      여러개의 생성자를 만든다는 것은 초기화가 생성자에 의해 달라질 수 있는데 ,
      어떤 생성자가 불려지든 간에 공통적으로 이뤄져야 할 것은 인스턴스 초기화 블록에 작성하자!
*/

/* 1 */
  // 인스턴스 초기화 블록 
  {
    speed = 100;  
    System.out.println("인스턴스 초기화 블록이 제일 먼저 출력 됩니다");
  }

/* 2 */
  // default 생성자 
  Car(){
    counter += 1; // 생성된 객체의 수를 세기위한 변수
    System.out.println();
    System.out.println("속도는 " + speed);
  }
/* 3 */
  // 생성자 
  public Car (String name){
    this.name = name;
    System.out.println();
    System.out.println("이름은 " + name + " 입니다");
  }
  
  
  @Override
  public String toString(){
    return counter + " 번째 객체가 잘 생성 되었습니다";
  }

  public static void main(String[] args) {

    
    // 객체 1 생성
    Car myCar1 = new Car();                   // default 생성자
    Car myCarname1 = new Car("LS 500h");  // 일반 생성자
    System.out.println(myCar1);
    System.out.println(myCarname1);
    
    // 객체 2 생성
    Car myCar2 = new Car();                // default 생성자
    Car myCarname2 = new Car("520d"); // 일반 생성자
    System.out.println(myCar2);
    System.out.println(myCarname2);

  }
}
