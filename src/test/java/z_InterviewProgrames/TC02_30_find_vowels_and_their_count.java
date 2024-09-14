package z_InterviewProgrames;

import java.util.ArrayList;

public class TC02_30_find_vowels_and_their_count {

	public static void main(String[] args) {

		String str = "hello vishwanath";
		char[] s = str.toCharArray();

		ArrayList<Character> al = new ArrayList<Character>();

		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'a' || s[i] == 'e' || s[i] == 'i' || s[i] == 'o' || s[i] == 'u') {
				al.add(s[i]);

			}
		}

		Character[] arr1 = new Character[al.size()];
		arr1 = al.toArray(arr1);
		int[] arr2 = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			int newCount = 1;
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] == arr1[j]) {
					newCount++;
					arr1[j] = '0';
				}
			}
			arr2[i] = newCount;
		}
		
		// print the frequency of elements in array
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != '0') {
				System.out.println(arr1[i] + " " + arr2[i]);
			}
		}
		
	}
}
