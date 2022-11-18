package j10_배열;

public class Array2 {
	public static void main(String[] args) {
		
		String[] names = new String[10];
		names[0] = "임지현";
		names[1] = "신경수";
		names[2] = "고희주";
		names[3] = "문승주";
		names[4] = "장건녕";
//		String[] names = {"임지현", "신경수", "고희주", "문승주", "장건녕"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println("이름" + (++i) + " : " + names[--i]);
		}
	}
}
