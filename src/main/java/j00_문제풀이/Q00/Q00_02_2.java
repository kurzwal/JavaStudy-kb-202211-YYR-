package j00_문제풀이.Q00;

public class Q00_02_2 {
	/*
	 	강사님 답안
	 */
	public static int getMinNumber(int num1, int num2) {
		return num1 < num2 ? num1 : num2;
	}
	
	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1, 8, 9, 16, 17};
		int[] nums2 = new int[] {2, 7, 10, 15, 18};
		int[] nums3 = new int[] {3, 6, 11, 14, 19};
		int[] nums4 = new int[] {4, 5, 12, 13, 20};
		// 4개의 배열 중 인덱스마다 최소값을 뽑는다
		int[] result = new int[5];
		
		System.out.println("[답 배열]");
		
		for (int i = 0; i < nums1.length; i++) {
			result[i] = getMinNumber(getMinNumber(nums1[i], nums2[i]), getMinNumber(nums3[i], nums4[i]));
			System.out.print(result[i] + (i != result.length - 1 ? ", " : "\n"));
		}
	}
}
