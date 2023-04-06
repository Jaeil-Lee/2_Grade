
class A {
	int x = 3;
	int y = 5;

	void prtX() {
		System.out.println(x);
	}
}

class B extends A {
	int x = 4;
	
	void prtY() {
		System.out.println(y);
	}
}


public class TEST_1 {

	public static void main(String[] args) {
		B b = new B();
		
		System.out.println(b.y);   // 5
		System.out.println(b.x);   // 4
		b.prtX();                  // 3
		b.prtY();                  // 5
	}

}