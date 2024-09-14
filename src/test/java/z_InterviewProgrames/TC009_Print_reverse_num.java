package z_InterviewProgrames;

import java.util.Scanner;

public class TC009_Print_reverse_num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		while (n != 0) {

			int rem = n % 10;
			rev = rev * 10 + rem;
			n /= 10;
		}
		System.out.println(rev);

	}
}
