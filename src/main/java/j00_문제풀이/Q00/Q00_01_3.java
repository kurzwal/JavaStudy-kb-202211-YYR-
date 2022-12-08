package j00_문제풀이.Q00;

import java.util.ArrayList;
import java.util.List;

/*
   	강사님 답안 (from github)
 */
public class Q00_01_3 {
	public static int[] add(int[] array, int value) {
		int[] resultArray = new int[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			resultArray[i] = array[i];
		}
		resultArray[array.length] = value;

		return resultArray;
	}
	
	

	public static int[] getDuplicateArray(int[] array1, int[] array2) {
		int[] resultArray = new int[0];

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					resultArray = add(resultArray, array1[i]);
				}
			}
		}

		return resultArray;
	}

	public static int[] getNonDuplicateArray(int[] array1, int[] array2) {
		int[] resultArray = new int[0];

		for (int i = 0; i < array1.length; i++) {
			int duplicateCountInArray1 = 0;

			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					duplicateCountInArray1++;
				}
			}
			if (duplicateCountInArray1 != 0) {
				continue;
			}
			resultArray = add(resultArray, array1[i]);
		}

		for (int i = 0; i < array2.length; i++) {
			int duplicateCountInArray2 = 0;

			for (int j = 0; j < array2.length; j++) {
				if (array2[i] == array1[j]) {
					duplicateCountInArray2++;
				}
			}
			if (duplicateCountInArray2 != 0) {
				continue;
			}
			resultArray = add(resultArray, array2[i]);
		}

		return resultArray;
	}

	public static int getMinNumberInArray(int[] array) {
		int min = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		return min;
	}

	public static int getMaxNumberInArray(int[] array) {
		int max = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(33);
		list.indexOf(3);
		list.contains(3);
		
		

		int[] nums1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] nums2 = new int[] { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

		int[] duplicateArray = getDuplicateArray(nums1, nums2);
		int[] nonDuplicateArray = getNonDuplicateArray(nums1, nums2);

		int minNumberInDuplicateArray = getMinNumberInArray(duplicateArray);
		int maxNumberInNonDuplicateArray = getMaxNumberInArray(nonDuplicateArray);

		System.out.println("중복된 값 중 최소값: " + minNumberInDuplicateArray);
		System.out.println("중복되지 않은 값 중 최대값: " + maxNumberInNonDuplicateArray);

		/*
		 * 1. 두 배열에서 중복된 값 중 최소값 2. 두 배열에서 중복되지 않은 값 중 최대값
		 */

	}
}