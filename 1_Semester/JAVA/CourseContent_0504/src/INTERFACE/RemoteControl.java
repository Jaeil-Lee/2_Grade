package INTERFACE;

public interface RemoteControl {
	// 추상 메소드 정의
	public void turnOn(); // 가전 제품을 켠다.

	public void turnOff(); // 가전 제품을 끈다.
}

// public abstract가 자동으로 붙는다

class Television implements RemoteControl {
	public void turnOn() {
		// 실제로 TV의 전원을 켜기 위한 코드가 들어 간다.
	}

	public void turnOff() {
		// 실제로 TV의 전원을 끄기 위한 코드가 들어 간다.
	}
}
