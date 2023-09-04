import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.Timer;

/* 🚩 public class 🚩 */
public class Test4 {
  public static void main(String[] args) {
    
    ActionListener listener = new MyClass();  // interface로 구현한 객체는 어떠한 형태로도 받을 수 있기 때문에 인터페이스를 쓴다
    // MyClass listener = new MyClass();  -> 하이라키 구조로 이렇게  MyClass 로도 가능하다

    Timer timer = new Timer(1000, listener); // awt에 있는
    timer.start();

    Scanner input = new Scanner(System.in);
    System.out.println("文字を入力してねん！");
    
    System.out.println(input.nextLine());



    // for (int i = 0; i < 1000; i++) {
		// 	try {
		// 		Thread.sleep(1000);
		// 	} catch (InterruptedException e) {
		// 	}
		// }


  }
}


/* 🚩 class 🚩*/ 
class MyClass implements ActionListener {

  @Override
  public void actionPerformed(ActionEvent e) {
    System.out.println("ぴポぴポ~~~~~");
  }
}
