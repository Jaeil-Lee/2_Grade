package BOOK;

public class Television implements RemoteControl {
  
  boolean onOff = false;

  // １．テレビの電源を点けるためのコード
  public void turnOn() {  
    System.out.println("テレビオン⭕");
    onOff = true;
  }
  
  
  // ２．テレビの電源を消すためのコード
  public void turnOff() {
    System.out.println("テレビオフー❌");
    onOff = false;

  }


}
