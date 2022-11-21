package j00_문제풀이.Q00;

public class Q00_01 {
	/*
	두개의 배열 중 겹치면서 제일 큰값과
	두개의 배열 중 겹치지 않으면서 제일 작은값 구하기
 */
	public static boolean foundInt(int num, int[] arr) {	// 겹치면 true
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
            return true;
         }
		}
		return false;
	}
	public static int foundMinNumber(int[] arr1, int[] arr2) { // 겹치면서 최솟값 찾기
		int count = 0;
		int min = 0;
		for (int i = 0; i < arr1.length; i++) { // 첫값 찾기 (겹치기만 하면 통과후 바로 브레이크)
			if(foundInt(arr1[i], arr2)) {
				min = arr1[i];
				count = i;
				break;
			}
		}
		for (int i = count ; i < arr1.length ; i++) { // 첫값과 비교해서 arr1에서만 찾기
			if(foundInt(arr1[i], arr2) && min > arr1[i]) {
            min = arr1[i];
         }
		}
		return min;
	}
	public static int foundMaxNumber(int[] arr1, int[] arr2) { // 안겹치면서 최댓값 찾기
		int count = 0;
		int max = 0;
		for (int i = 0; i < arr1.length; i++) { // 첫값 찾기 (안겹치기만 하면 통과후 바로 브레이크)
			if(!foundInt(arr1[i], arr2)) {
				max = arr1[i];
				count = i;
				break;
			}
		}
		for (int i = count ; i < arr1.length ; i++) { // 첫값과 비교해서 arr1에서 찾기
			if(!foundInt(arr1[i], arr2) && max < arr1[i]) {
				max = arr1[i];
			}
		}
		for (int i = 0 ; i < arr2.length ; i++) { // 가져온 값은 arr2에서도 찾기
			if(!foundInt(arr2[i], arr1) && max < arr2[i]) {
				max = arr2[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] arr2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		System.out.print("최소값 : ");
		System.out.println(foundMinNumber(arr1, arr2));
		System.out.print("최대값 : ");
		System.out.println(foundMaxNumber(arr1, arr2));
	}
}
