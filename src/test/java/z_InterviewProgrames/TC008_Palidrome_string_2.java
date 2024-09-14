package z_InterviewProgrames;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TC008_Palidrome_string_2 {

	public static void main(String[] args) {

		String str = "nitin";
		System.out.println(palidrome(str));
	}

	public static boolean palidrome(String str) {

		int i = 0;
		int j = str.length() - 1;

		while (i < j) {
			if (str.charAt(i) == str.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
}
