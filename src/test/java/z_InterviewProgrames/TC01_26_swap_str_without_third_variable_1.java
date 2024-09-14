package z_InterviewProgrames;

public class TC01_26_swap_str_without_third_variable_1 {

	public static void main(String[] args) {

		String a = "rahul";
		String b = "david";

		a = a + b;

		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
		
		
		
		
		
	}

}
