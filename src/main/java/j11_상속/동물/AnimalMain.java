package j11_상속.동물;

public class AnimalMain {
	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();			// Animal 객체 생성 이후 Human 객체 생성
		Tiger tiger = new Tiger();			// 생성자에 작성하지 않아도 super(); 가 먼저 실행됨.
		
		Animal hAnimal = (Animal) human; // 업캐스팅
		Animal tAnimal = tiger;
		Animal[] animals = new Animal[3];

//		animals[0] = hAnimal;
//		animals[1] = human;					// 업캐스팅 (묵시적 형변환)

		animals[0] = new Human();
		animals[1] = new Tiger();
		animals[2] = new Animal();
		
		System.out.println();
		
		for (int i = 0 ; i < animals.length; i++) { 	// 상속한 뒤 오버라이드 한 메서드는
			animals[i].move();								// 업캐스팅 이후에도 오버라이드 된 메서드가 실행됨.
		}
		
		System.out.println();
		// Human h = (Human) animals[0];		// 다운캐스팅은 명시적 형변환이 필요하다
		
		for (int i = 0 ; i < animals.length; i++) {
			if (animals[i] instanceof Human) {			// 다운캐스팅이 가능한지 묻는 instanceof
				Human h = (Human) animals[i];				// 업캐스팅을 같은 자료형으로 했던 것만 다운캐스팅 가능
				h.readBooks();
			} else if (animals[i] instanceof Tiger) {
				Tiger t = (Tiger) animals[i];
				t.hunting();
			} else {
				System.out.println("다운캐스팅 불가");
			}
		}
	}
}
