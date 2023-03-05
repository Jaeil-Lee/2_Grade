package test_1;

// Box 클래스 정의
class Box {
    int width;
    int length;
    int height;
}

public class TestBox {

	public static void main(String[] args) {

		// 1. Box 클래스 생성
		Box box = new Box();
		
		// 2. box 멤버 변수 입력
		box.width = 20;
		box.length = 20;
		box.height = 30;
		
		// 3. box 내용 출력 
		System.out.println("상자의 가로, 세로, 높이는 " + box.width + ", " + box.length + ", " + box.height + "입니다.");
	}

}
