package POLYMORPHISM;

class Animal {
  void sound () {
    System.out.println("Animal 클래스의 sound()");
  }
}


class Dog extends Animal{
  /* Animal의 메서드 오버라이딩 */
  void sound () {   
    System.out.println("멍멍!! (  Dog의 sound( )  )");
  }
  
}
class Cat extends Animal{
  /* Animal의 메서드 오버라이딩 */
  void sound () {
    System.out.println("야옹~ (  Cat의 sound( )  )");
  }
}

public class DynamicCallTest {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Dog dog = new Dog();
    Cat cat = new Cat();

    Animal obj; // Animal 형의 obj 객체 생성


    // 1.animal   => Animal 클래스의 sound()
    obj = animal;  
    obj.sound();
    
    //2. dog    => 멍멍!! (  Dog의 sound( )  )
    obj = dog;
    obj.sound();

    //3. cat    => 야옹~ (  Cat의 sound( )  )
    obj = cat;
    obj.sound();


  }  
}
