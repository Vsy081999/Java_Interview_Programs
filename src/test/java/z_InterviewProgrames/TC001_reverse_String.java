package z_InterviewProgrames;

public class TC001_reverse_String {

	public static void main(String[] args) {

		String str = "Germany";

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);

		}
		System.out.println(rev);

	}
}
