package z_InterviewProgrames;

import java.util.ArrayList;

public class TC032_zero_to_right_otherdigitstoleft {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 0, 6, 0, 7, 0, 9, 5};

		zero_to_right_otherdigitstoleft(arr);
		
	}

	public static void zero_to_right_otherdigitstoleft(int[] arr) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				count++;
			} else {
				list.add(arr[i]);
			}
		}
	
	    Integer[] arr1 = list.toArray(new Integer[list.size()]);
		int[]arr2 =new int[arr.length];
		
		int k = 0;
		for (int j = count; j < arr2.length; j++) {
				arr2[j] = arr1[k];
			     k++;
		}

		for (int l = 0; l < arr2.length; l++) {
			System.out.print(arr2[l]);
		}
	}
}
