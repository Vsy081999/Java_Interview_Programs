package z_InterviewProgrames;

public class TC02_31_checkPrimeExclude_3_7 {

	public static void main(String[] args) {

		for (int i = 0; i < 40; i++) {

			if (IsPrime(i)) {

				if (exclueNum(i))
					System.out.println(i);
			}

		}

	}

	public static boolean IsPrime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean exclueNum(int num) {

		while (num != 0) {
			int rem = num % 10;
			if (rem == 3 || rem == 7) {
				return false;
			}
			num = num / 10;
		}
		return true;
	}
}
