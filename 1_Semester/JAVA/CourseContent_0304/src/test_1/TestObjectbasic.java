package test_1;

public class TestObjectbasic {
	double squareDouble(double df) {
		test();
		return df * df;
	}

	int squareInt(int num) {
		return num * num;
	}

	void test() {
		System.out.println("test method called!");
	}

	public static void main(String[] args) {

		// 1. 객체 생성
		TestObjectbasic jt = new TestObjectbasic();

		// 1-1. result 객체 생성
		int result = jt.squareInt(3);
		System.out.println(result);

		
		// 1-2. result2 객체 생성
		double result2 = jt.squareDouble(3.14);
		System.out.println(result2);

	}

}
