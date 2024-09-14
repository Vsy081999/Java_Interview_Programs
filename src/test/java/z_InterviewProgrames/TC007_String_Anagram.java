package z_InterviewProgrames;

import java.util.Arrays;

public class TC007_String_Anagram {

	public static void main(String[] args) {

		String first = "sileat";
		String second = "listen";

		if (first.length() != second.length()) {
			System.out.println("String is not anagram");
		} else {
			char[] s1 = first.toCharArray();
			char[] s2 = second.toCharArray();

			Arrays.sort(s1);
			Arrays.sort(s2);

			if (Arrays.equals(s1, s2) == true) {
				System.out.println("string is anagram");
			} else {
				System.out.println("string is not anagram");
			}
		}
	}
}
