package ANONYMOUS_CLASS;

interface RemoteControl {
  void turnOn();
  void turnOff();
}


public class AnonymousClassTest {
  public static void main(String[] args) {

    RemoteControl ac = new RemoteControl () {  // 무명 클래스 정의

      public void turnOn(){
        System.out.println("테레비 turnOn()");
      }
      public void turnOff(){
        System.out.println("테레비 turnOff()");
      }

    };

    ac.turnOn();
    ac.turnOff();

  }
}
