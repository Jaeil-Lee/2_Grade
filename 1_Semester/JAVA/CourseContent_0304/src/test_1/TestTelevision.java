package test_1;

class Television {
	int channel;
	int volume;
	boolean isOn;

	void print() {
		System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
	}
}

public class TestTelevision {

	public static void main(String[] args) {
		
		// 1. myTV 객체 생성
		Television myTV = new Television();

		myTV.channel = 7;
		myTV.volume = 9;
		myTV.isOn = true;
		myTV.print();

		
		// 2. yourTV 객체 생성
		Television yourTV = new Television();
		yourTV.channel = 9;
		yourTV.volume = 12;
		yourTV.isOn = true;
		yourTV.print();

	}

}
