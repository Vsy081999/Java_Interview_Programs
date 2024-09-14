package z_InterviewProgrames;

public class TC01_28_Missing_num_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 4, 5, 6 };

		int sum1 = 0;

		for (int i = 0; i < arr.length; i++) {
			sum1 += arr[i];
		}
		System.out.println("sum of range of elements in Arrays : " + sum1);

		int sum2 = 0;

		for (int i = 1; i <= 6; i++) {
			sum2 += i;
		}
		System.out.println("sum of range of elements : " + sum2);
		System.out.println(sum2 - sum1);

	}
}
