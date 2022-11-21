package j00_문제풀이.Q00;

public class Q00_01_2 {
	/*
   	강사님 답안 (from handwrite)
 */
	public static int[] add(int[] array, int value) {
	int[] resultArray = new int[array.length+1];
	for (int i = 0; i < array.length; i++) {
		resultArray[i] = array[i];
	}
	resultArray[array.length] = value;
	return resultArray;
	}
	
	public static int[] duplicateArray(int[] array1, int[] array2) {
		int[] resultArray = new int[0];
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					resultArray = add(resultArray, array1[i]);
					break;
				}
			}
		}
		return resultArray;
	}
	
	public static int[] nonDuplicateArray(int[] array1, int[] array2) {
		int[] resultArray = new int[0];
		
		for (int i = 0; i < array1.length; i++) {
			int count = 0;
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
               count++;
            }
			}
			if(count == 0) {
				resultArray = add(resultArray, array1[i]);
			}
		}
		for (int i = 0; i < array2.length; i++) {
			int count = 0;
			for (int j = 0; j < array1.length; j++) {
				if (array2[i] == array1[j]) {
               count++;
            }
			}
			if(count == 0) {
				resultArray = add(resultArray, array2[i]);
			}
		}
		
		return resultArray;
	}
	
	public static int cmpMin(int[] array) {
		int min = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	public static int cmpMax(int[] array) {
		int max = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[] nums1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] nums2 = new int[] {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		
		int[] duplicateArray = duplicateArray(nums1, nums2);
		int[] nonDuplicateArray = nonDuplicateArray(nums1, nums2);
		for (int i = 0; i < nonDuplicateArray.length; i++) {
			System.out.println(nonDuplicateArray[i]);
		}
		
		int duplicateMinNumber = cmpMin(duplicateArray);
		int nonDuplicateMaxNumber = cmpMax(nonDuplicateArray);
		
		System.out.println(duplicateMinNumber);
		System.out.println(nonDuplicateMaxNumber);
	}
}
