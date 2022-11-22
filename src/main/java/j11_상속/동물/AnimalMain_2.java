package j11_상속.동물;

public class AnimalMain_2 {
	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		for (int i = 0; i < animals.length; i++) {
			if (i % 2 == 0) {
				animals[i] = new Human();
			} else {
				animals[i] = new Tiger();
			}
		}
		
		System.out.println("\n[업캐스팅]");
		for(int i = 0; i < animals.length; i++) {
			animals[i].move();
		}
		
		System.out.println("\n[다운캐스팅]");
		
		for(int i = 0; i < animals.length; i++) {
			if (animals[i] instanceof Human) {
				((Human) animals[i]).readBooks();		// 괄호로 묶으면 바로 다운캐스팅 가능
			} else if (animals[i] instanceof Tiger) {
				((Tiger) animals[i]).hunting();
			} else {
				System.out.println("다운캐스팅 불가");
			}
		}
	}
}
