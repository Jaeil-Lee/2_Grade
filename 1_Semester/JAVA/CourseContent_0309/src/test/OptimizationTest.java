package test;

public class OptimizationTest {
	public static void main(String[] args) {

		/* Optimization */

		String s1 = "동해물과 백두산이"; // new String("동해물과 백두산이")

		char c = s1.charAt(5);
		System.out.println(c);

		String s2 = "동해물과 백두산이";

		// 자바에서는 같은 문자열의 내용이면 내적으로 옵티마이 제이션해서 따로 주소값을 할당하지 않고 기존의
		boolean result = s1 == s2;
		System.out.println(result);

		String s3 = new String("동해물과 백두산이");

		result = s1 == s3;

		System.out.println(result);



		/* result = s3.equals(s1); // 문자열을 대소문자 구분 없이 비교
		System.out.println(result);

		s1 = new String("i love betty");
		s2 = new String("I love betty");

		result = s1.equalsIgnoreCase(s2); // 대소문자를 무시하고 비교하기 때문에, 대소문자가 다르더라도 문자열이 동일하면 true를 반환
		System.out.println(result);

		// Question 1. isSame이 true인 이유는
		String a = "111";
		String b = "111";
		boolean isSame = a == b;
 */
		/*Answer 1.

		  isSame이 true인 이유는, Java에서 String 클래스의 == 연산자는 참조 비교를 수행하기 때문입니다. 즉, a와 b가 모두
		  같은 문자열 리터럴 "111"을 참조하고 있으므로 isSame은 true가 됩니다.
		  
		  하지만 String 클래스의 equals() 메서드를 사용하면 값 비교를 수행할 수 있습니다. 따라서 a.equals(b)를 호출하면
		  true가 반환됩니다.
		  
		  toString() 메서드는 객체의 문자열 표현을 반환하는 것이지만, String 클래스는 이미 문자열이므로 toString()을 호출하지
		  않아도 됩니다.
		  
		  즉, isSame이 true가 되는 것은 참조 비교로 인한 것이며, 값을 비교하려면 equals() 메서드를 사용해야 합니다.
		 */


		 
		// Question 2. "111"는 어디에 참조되고 있나요

		/* Answer 2.

		  Java에서는 문자열 리터럴은 문자열 풀(String Pool)이라고 하는 공유된 문자열 저장 영역에 저장됩니다. 따라서 "111" 문자열
		  리터럴은 컴파일 타임에 이미 생성되어 문자열 풀에 저장되며, 이후에 같은 문자열 리터럴이 등장하면 이전에 생성된 문자열을 참조하게 됩니다.
		  
		  따라서, 코드에서 "111"이라는 문자열 리터럴을 사용하면, 해당 문자열은 문자열 풀에서 이미 생성되어 있으므로, 모든 "111" 문자열
		  리터럴은 같은 객체를 참조하게 됩니다
		 */

	}
}
