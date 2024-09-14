package z_InterviewProgrames;

public class TC02_31_Frequency_of_Integer {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 8, 2, 8, 3, 3 };
		// Array fr will store frequencies of element
		int[] fr = new int[arr.length];
		int visited = -1;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					// To avoid counting same element again
					arr[j] = visited;
				}
			}
			fr[i] = count;
		}

		for (int i = 0; i < fr.length; i++) {
			if (arr[i] != visited) {
				System.out.println(arr[i] + " " + fr[i]);
			}
		}
	}
}