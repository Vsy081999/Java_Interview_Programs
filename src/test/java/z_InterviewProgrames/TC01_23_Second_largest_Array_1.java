package z_InterviewProgrames;

public class TC01_23_Second_largest_Array_1 {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3, 9, 7, 1 };

		System.out.println(second_largest(arr));

	}

	public static int second_largest(int[] arr) {
		int temp;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}

		return arr[arr.length - 2];

	}

}
