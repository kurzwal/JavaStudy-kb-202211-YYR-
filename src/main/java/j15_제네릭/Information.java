package j15_제네릭;

import lombok.Getter;

public class Information<T> {
	@Getter
	private T target;
	
	public Information(T target) {
		this.target = target;
	}
	
	public void printInfo() {
		System.out.println(target);
	}

}
