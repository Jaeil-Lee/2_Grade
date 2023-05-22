package Anonymous;

public class HelloWorld {

  public void sayHello() {
    // Hello World를 인사를 영어로, 프랑스어로, 스페인어로 출력한다.
    // 영어로 인사할 때는 Hello 인터페이스를 구현하는 클래스 EnglishGreeting를
    // 정의하고, 그 객체를 생성해서 인사
    // 프랑스어와 스페인어로 인사할 때는 무명 클래스로 객체를 생성해서 인사.

    /* 🟡 1. 영어 */
    Hello engHello = new EnglishGreeting();
    engHello.greetSomeone("world");

    /* 🟡 2. 불어 */
    Hello frenchHello = new Hello() {
      @Override
      public void greetSomeone(String someone) {
        System.out.println("Salut tout le monde " + someone);
      }
    };
    frenchHello.greetSomeone("Fred");

    /* 🟡 3. 스페인 */
    Hello spanHello = new Hello() {
      public void greetSomeone(String someone) {
        System.out.println("como estas? " + someone);
      }
    };
    spanHello.greetSomeone("mundo"); // "Hola mundo"

  }

  public static void main(String[] args) {
    HelloWorld hw = new HelloWorld();
    hw.sayHello();
  }

}



/* 🟢 인터페이스 */
interface Hello {
  void greetSomeone(String someone);
}

/* 🟢 클래스 : EnglishGreeting */
class EnglishGreeting implements Hello {
  @Override
  public void greetSomeone(String someone) {
    System.out.println("Hello " + someone);
  }
}