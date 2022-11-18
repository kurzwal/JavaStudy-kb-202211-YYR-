package j00_문제풀이.Q00;

public class Q00_02 {
	public static void main(String[] args) {
		
		int[] nums1 = new int[] {1, 8, 9, 16, 17};
		int[] nums2 = new int[] {2, 7, 10, 15, 18};
		int[] nums3 = new int[] {3, 6, 11, 14, 19};
		int[] nums4 = new int[] {4, 5, 12, 13, 20};
		// 4개의 배열 중 인덱스마다 최소값을 뽑는다
		int[] result = new int[5];
		for (int i = 0; i < nums1.length; i++) {
			int[] arr = new int[]{nums1[i], nums2[i], nums3[i], nums4[i]};
			int min = arr[0];
			for (int j = 0 ; j < arr.length; j++) {
				if (arr[j] < min) {
               min = arr[j];
            }
			}
			result[i] = min;
		}
		System.out.println("[답 배열]");
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + (i != result.length - 1 ? ", " : "\n"));
		}
		
	}
}
