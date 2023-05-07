package SELF;
public class SamsungTv implements AdvancedRemoteControl {

  @Override
  public void turnOn() {
    System.out.println("삼성 tv를 켠다");
  }

  @Override
  public void turnOff() {
    System.out.println("삼성 tv를 끄다");
  }

  @Override
  public void volumeControl(int amount) {
    String st = null;
    st = amount >= 0 ? "높입니다." : "줄입니다";
    amount = Math.abs(amount); // |number|
    System.out.println("볼륨을" + amount + "만큼" + st);

  }

}
