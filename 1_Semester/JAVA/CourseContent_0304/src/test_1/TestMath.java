package test_1;

// Math 클래스 정의
class Math {
	
	int add(int argX, int argY) {
		return argX + argY; /*메소드 종료!*/
	}
}

public class TestMath {

	public static void main(String[] args) {

		int sum; // argX + argY 의 결과 값 변수
		
		// 1. objMath 객체 생성
		Math objMath = new Math();
		
		// 2. 인자 값을 sum 변수에 대입
		sum = objMath.add(2, 3);
		System.out.println("2와 3의 합은 " + sum);
		
		// 3. 인자 값을 sum 변수에 대입  
		sum = objMath.add(7, 8);
		System.out.println("7와 8의 합은 " + sum);

	}

}
