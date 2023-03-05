package test_1;

public class TestOverloading {
	
	// 형이 다른 메서드를 이용해 매개 변수의 값으로 차이를 두어 오버로딩 실현
	double square(double df) {
		test();
		return df * df; /*메소드 종료!*/
	}

	int square(int num) {
		return num * num; /*메소드 종료!*/
	}

	void test() {
		System.out.println("test method called!");
	}

	public static void main(String[] args) {

		// 1. 객체 생성
		TestOverloading jt = new TestOverloading();

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
