package test_1;

public class TestScop_1 {
	
	// 코딩할 때 왠만하면 별이 없는한  private
	// 멤버변수는 왠만하면 private를 사용해야한다..  이러면 다른 파일에서 불러올때 에러 뜬다
	private String name; // 같은 멤버 메서드 내에서만 접근 가능하다
	
	
	// 이렇게 하면 private를 해도 다른 클래스에서 불러올 수 있다. 
	String getName() {
		return name; // this.name 이 원래모습이지만 this가 생략되어 있다
	}
	
	void setName(String name) {
		this.name = name;   // 오른쪽은 7번째 줄 name이고 오른쪽은 매개변수의 name이다
	}
	
	// 형이 다른 메서드를 이용해 매개 변수의 값으로 차이를 두어 오버로딩 실현
	double square(double df) {
		test();
		return df * df;
	}

	int square(int num) {
		return num * num;
	}

	void test() {
		System.out.println("test method called!");
	}

	public static void main(String[] args) {
		// 1. 객체 생성
		TestScop_1 jt = new TestScop_1();

		// 1-1. result 객체 생성
		int result = jt.square(3);
		System.out.println(result);

		// 1-2. result2 객체 생성
		double result2 = jt.square(3.14);
		System.out.println(result2);

		// println도 오버러딩의 대표적인 예이다!!
		System.out.println("String.....");
		System.out.println(7);
		System.out.println(true);
		System.out.println(8.678);

	}

}
