package z_InterviewProgrames;

import java.util.Scanner;

public class TC01_20_Is_Armstrong_Number {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(IsArmstrong(n));
	}

	public static boolean IsArmstrong(int num) {
		int digitcount = digit_count(num);
		int temp = num;
		int sum = 0;

		while (num != 0) {
			int rem = num % 10;
			sum += (int) Math.pow(rem,digitcount);
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}

	public static int digit_count(int num) {
		int count = 0;
		while (num != 0) {
			int rem = num % 10;
			count++;
			num /= 10;
		}

		return count;
	}
}
