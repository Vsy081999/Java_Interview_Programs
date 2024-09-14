package z_InterviewProgrames;

public class TC01_27_find_Unique_String {

	public static void main(String[] args) {

		String str = "codingblocks";

		System.out.println(Isunique(str));

	}

	public static boolean Isunique(String str) {

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
