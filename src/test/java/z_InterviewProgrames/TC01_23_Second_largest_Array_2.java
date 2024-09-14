package z_InterviewProgrames;

public class TC01_23_Second_largest_Array_2 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3,7, 1 };

//		int largest = Integer.MIN_VALUE;
//		int sec_largest = Integer.MIN_VALUE;
		
		int largest = arr[0];
		int sec_largest = arr[0];
		
		

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				sec_largest = largest;
				largest = arr[i];

			} else if (arr[i] > sec_largest && arr[i] != largest) {
				sec_largest = arr[i];

			}
		}
		System.out.println(sec_largest);
	}
}
