package j11_상속.동물;

public class Tiger extends Animal {
	public Tiger() {
		System.out.println("Tiger 객체 생성");
	}
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	
}
