package j09_접근지정자.test;

import j09_접근지정자.Access1;
import j09_접근지정자.Access2;

public class testMain {
	public static void main(String[] args) {
			Access1 access1 = new Access1();
			Access2 access2 = new Access2();
			Access3 access3 = new Access3();
			Access4 access4 = new Access4();
			
			access4.access1PrintName();
	}
}
