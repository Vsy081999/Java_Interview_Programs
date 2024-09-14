package z_InterviewProgrames;

public class TC01_22_fabiconni {

	public static void main(String[] args) {

		Is_fabiconi(10);
	}

	public static void Is_fabiconi(int n) {
		int a = 0;
		int b = 1;

		for (int i = 0; i <= 10; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(a+" ");
		}

	}

}
