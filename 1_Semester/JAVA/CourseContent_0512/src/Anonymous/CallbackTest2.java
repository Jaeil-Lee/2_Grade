package Anonymous;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Timer;

/* 🚩 public class 🚩 */
public class CallbackTest2 {
  public static void main(String[] args) {

  /* 
   * javax.swing.Timer 클래스의 객체를 생성하기 위해서는
   * int 타입의 delay, java.awt.event.ActionListener 인터페이스 타입의 객체를넘겨줘야 한다
   * 두 번쨰 인자인 저 객체를 넘겨주기 위해서는 아래의 두 가지 방법 중 하나를 사용하면 된다.
   *  1. 저 인터페이스를 구현하는 클래스를 정의하고, 그 클래스의 개게를 생성해 넘겨 준다.
   *  2. 저 인터페이스를 구현하는 클래스를 무명클래스로 정의한다.
   *    무명클래스 클래스 정의와 객체 생성이 하나의 문장으로 해결되는 것. 
   */


    ActionListener listener = new MyClass(); // interface로 구현한 객체는 어떠한 형태로도 받을 수 있기 때문에 인터페이스를 쓴다
    // MyClass listener = new MyClass(); -> 하이라키 구조로 이렇게 MyClass 로도 가능하다

    Timer timer = new Timer(1000, listener); // awt에 있는
    timer.start();
    
    ActionListener beef = new ActionListener() {
      // Scanner input = new Scanner(System.in);
      
      @Override
      public void actionPerformed(ActionEvent e) {
        System.out.println("ぴポぴポ!@#!@#!@#!@~~~~~");
        
        
      }
      
    };
    // Timer time = new Timer(1000, listener); // awt에 있는
    beef.actionPerformed(null);

    
      Scanner input = new Scanner(System.in);
      System.out.println("文字を入力してねん！");
      input.nextLine();
      input.close();
      System.out.println(input.nextLine());
     

    for (int i = 0; i < 1000; i++) {
    try {
    Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
    }

  }
}

/* 🚩 class 🚩 */
class MyClass implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("ぴポぴポ~~~~~");
  }
}

