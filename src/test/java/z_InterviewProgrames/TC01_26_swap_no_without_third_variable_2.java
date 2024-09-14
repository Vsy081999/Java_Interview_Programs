package z_InterviewProgrames;

public class TC01_26_swap_no_without_third_variable_2 {

	public static void main(String[] args) {

		int a = 3;
		int b = 6;

		a = a + b;

		//a=3
		//b=6
		
		b=a-b;
	   //9-6=3
		a=a-b;
		//9-3=6
		
		System.out.println("a "+a);
		System.out.println("b "+b);
		
		
		
		
		
	}

}
