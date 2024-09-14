package z_InterviewProgrames;

public class TC002_reverse_Eachchar_String {

	public static void main(String[] args) {

		String str = "This is me";
		String words[] = str.split(" ");
		String reversewords = " ";

		for (String w : words) {

			String reveachchar = " ";
			
			for (int i = w.length() - 1; i >= 0; i--) {
				reveachchar = reveachchar + w.charAt(i);
			}
			reversewords = reversewords + reveachchar + " ";

		}

		System.out.println(reversewords);
		
		
	}
}
