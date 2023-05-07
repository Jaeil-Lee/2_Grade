package BOOK;

public class Refrigerator implements RemoteControl {
  
  boolean onOff = false;

  // １．テレビの電源を点けるためのコード
  public void turnOn() {  
    System.out.println("冷蔵庫オン⭕");
    onOff = true;
  }
  
  
  // ２．テレビの電源を消すためのコード
  public void turnOff() {
    System.out.println("冷蔵庫オフー❌");
    onOff = false;

  } 
  
}
