package z_InterviewProgrames;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TC01_21_Prime_Number_1 {

	public static void main(String[] args) {

		int num = 5;
		System.out.println(IsPrime(num));

	}

	public static boolean IsPrime(int num) {

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
