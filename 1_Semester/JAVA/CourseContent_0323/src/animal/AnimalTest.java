package animal;

  /* 상속과 접근제어자 */ 

  /*
     UML(Unified Modeling Language)

      "+" : public
      "-" : private
      "#" : protected
      디폴트 접근 제어자는 이러한 기호를 사용하지 않고, 속성이나 메서드 이름만 표기
  */

  /*
    🚩하이라키(Hierarchy)란?
    
      객체 지향 프로그래밍에서 클래스 간의 상속 관계를 나타내는 구조를 의미합니다.

    하이라키 구조는 상위 클래스와 하위 클래스 사이의 관계를 나타내며, 
    상위 클래스는 하위 클래스보다 일반적인 개념을 나타내고 하위 클래스는 상위 클래스보다 구체적인 개념을 나타냅니다.

    이러한 하이라키 구조는 다형성(polymorphism)의 기반을 이루며, 
    상속을 통해 코드 재사용성과 유지보수성을 높일 수 있습니다.

    Java에서는 모든 클래스가 Object 클래스를 상속하므로, 
    모든 클래스는 Object 클래스의 일부 메서드를 사용할 수 있습니다. 
    또한, 다중 상속을 지원하지 않기 때문에 클래스는 하나의 직계 상위 클래스만 가질 수 있습니다.
   */

public class AnimalTest {
  public static void main(String[] args) {

    Lion lion = new Lion();
    lion.eat();
    lion.sleep();
    lion.roar();
    
    
    Eagle eagle = new Eagle();
    eagle.eat();
    eagle.sleep();
    eagle.fly();


  }
}
