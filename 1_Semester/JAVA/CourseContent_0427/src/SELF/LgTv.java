package SELF;
public class LgTv implements RemoteControl {
  @Override
  public void turnOn() {
    System.out.println("LG tv를 킨다");
  }
  
  @Override
  public void turnOff() {
    System.out.println("LG tv를 끄다");
  }
  

}
