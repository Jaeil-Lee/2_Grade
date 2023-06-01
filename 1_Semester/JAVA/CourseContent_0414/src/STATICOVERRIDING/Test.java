package STATICOVERRIDING;

public class Test {
  public static void main(String[] args) {

    /*
       📌 동적바인딩 📌
            호출할 메소드는 변수의 타입을 보고 결정하는 것이 아니라 
            그 변수가 실제로 가르키고 있는 객체가 무엇이냐를 기준으로 결정
            
         => 🟡 동적 바인딩을 통해 다형성이 구현되는 것🟡       
     */
    Animal animal = new Cat();
    animal.sound();

    // eat은 정적 메소드이기 떄문에 객체를 생성하지 않고도 접근할 수 있다.
    // 물론 객체를 통해서도 접근할 수 있다.
    // 정적 메소드가 하위 클래스에서 재정의되는 경우에는 
    // 인스턴스 메소드가 재정의 되는 경우와 달리
    // 실제 그 인스턴스가 무엇인지를 기준으로 호출할 메소드가 결정되는 것이 아니다.
    // 🟡참조 변수의 타입을 보고 호출할 정적 메소드가 결정된다🟡 
    animal.eat();
    // Animal.eat();// 이렇게 호출해야 정확하지 


    System.out.println("-----------------------------");
  // 이렇게 없음
    animal = new Animal();
    animal.sound();   
    animal.eat();
    // Cat.eat(); // 이렇게 호출해야 정확하지 
  }
}
