package z_InterviewProgrames;

import java.util.ArrayList;
import java.util.Scanner;

public class TC01_29_find_longest_substring_from_string {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(longestsubstring(str));

	}

	public static String longestsubstring(String str) {

		ArrayList<String> ar = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				ar.add(str.substring(i, j));
			}
		}
		int ans = 0;
		String newstr = "";
		for (String s : ar) {

			if (uniquestring(s) == true) {
				ans = Math.max(ans, s.length());

				if (ans == s.length()) {
					newstr = s;
				}
			}
		}
		return newstr;
	}

	public static boolean uniquestring(String str) {

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

}
