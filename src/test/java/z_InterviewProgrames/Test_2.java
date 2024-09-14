package z_InterviewProgrames;

import java.util.HashMap;
import java.util.Map;

public class Test_2 {

	public static void main(String[] args) {

		String[] word1 = { "ab", "c" };
		String[] word2 = { "a", "bc" };

		System.out.println(arrayStringsAreEqual(word1, word2));

//		arrayStringsAreEqual(word1, word2);

	}

	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

		String s1 = "";
		String s2 = "";

		for (String w1 : word1) {
			for (int i = 0; i < w1.length(); i++) {
				s1 += w1.charAt(i);
			}

		}

		for (String w2 : word2) {
			for (int i = 0; i < w2.length(); i++) {
				s2 += w2.charAt(i);
			}
		}

		for (int i = 0; i < s1.length(); i++) {
			if (s1.equals(s2)) {
				return true;
			}
		}
		return false;
	}
}
