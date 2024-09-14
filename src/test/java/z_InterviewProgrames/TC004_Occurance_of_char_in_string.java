package z_InterviewProgrames;

import java.util.*;

public class TC004_Occurance_of_char_in_string {

	public static void main(String[] args) {

		String str = "aaaabbbbccccccaaaa";
		char[] arr = str.toCharArray();
//		String arr[] = str.split(" ");
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
//		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		
		for (char c : arr) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		
		}
		
		for (Map.Entry entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	
	}
}
