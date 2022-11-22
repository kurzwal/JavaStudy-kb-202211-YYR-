package j12_추상.추상클래스;

public class Tiger extends Animal{

	public Tiger(String kind) {
		super(kind);
	}
	@Override
	public void move() {
		System.out.println("호랑이가 움직인다");
	}
}
