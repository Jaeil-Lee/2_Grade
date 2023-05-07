package INTERFACE;

interface MyInterface {

  // 🚩 인터페이스의 정적(static) 메소드
	static void print(String msg) {
		System.out.println(msg + ": 인터페이스의 정적 메소드 호출~~~!");
	}

}
public class StaticMethodTest {
  
	public static void main(String[] args) {
		MyInterface.print("Java 8부터 가능하단다");
	}
}

