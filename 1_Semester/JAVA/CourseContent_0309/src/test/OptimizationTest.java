package test;

public class OptimizationTest {
	public static void main(String[] args) {
		
		String s1 = "동해물과 백두산이"; // new String("동해물과 백두산이")

		char c = s1.charAt(5);
		System.out.println(c);


		String s2 = "동해물과 백두산이";

		// 자바에서는 같은 문자열의 내용이면 내적으로 옵티마이 제이션해서 따로 주소값을 할당하지 않고 기존의 
		boolean result = s1==s2;
		System.out.println(result);

		String s3 = new String ("동해물과 백두산이");

		result = s1==s3;
		
		System.out.println(result);

		result = s3.equals(s1); // 문자열을 대소문자 구분 없이 비교
		System.out.println(result);

		s1 = new String("i love betty");
		s2 = new String("I love betty");

		result = s1.equalsIgnoreCase(s2); // 대소문자를 무시하고 비교하기 때문에, 대소문자가 다르더라도 문자열이 동일하면 true를 반환
		System.out.println(result);

	}
}
