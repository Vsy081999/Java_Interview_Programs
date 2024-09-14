package z_InterviewProgrames;

import java.util.Scanner;

public class Test_1 {

	public static void main(String[] args) {

//		int[] arr = { 1, 2, 3, 5, 6, 4 };

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		InsertionSort(arr, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void InsertionSort(int[] arr, int i) {

		int item = arr[i];
		int j = i - 1;

		while (item < arr[j] && i != 0) {
			arr[j + 1] = arr[j];
			arr[j] = item;
			j--;
		}
	}
}
