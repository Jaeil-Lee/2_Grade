package OBJECT;

// import해서 가져온다 
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;


public class MyFinal extends JFrame{


  public MyFinal() {
    setSize(300, 200); // setSize 메서드  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // setDefaultCloseOperation 메서드 
    setTitle("My Frame..."); // setTitle 메서드 
    setLayout(new FlowLayout()); //  setLayout 메서드 

    // button 객체 생성 
    JButton button = new JButton("버튼");
    add(button);
    setVisible(true);

  }
  public static void main(String[] args) {
    
    MyFinal f = new MyFinal();
  }
}
