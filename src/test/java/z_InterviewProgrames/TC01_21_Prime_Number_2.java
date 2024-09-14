package z_InterviewProgrames;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TC01_21_Prime_Number_2 {

	public static void main(String[] args) {

		int num = 25;
		boolean flag = false;

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}

	}

}
