
public class PatternPrint1 {

	public static void shapePrint() {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int k = 3; k >= 1; k--) {
			for (int j = k; j >= 1; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pyramid() {
		for (int i = 0; i < 4; i++) {
			for (int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void reversePyramid() {
		for (int i = 4; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			for (int j = 4; j >= i; j--) {
				System.out.print(" ");
			}
		}
	}

	public static void diamond() {
		int i, j, k, n = 4;

		for (i = 0; i < n; i++) {
			for (j = n - i; j > 1; j--) {
				System.out.print(" ");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for (k = 0; k < n - 1 - i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		 PatternPrint1.shapePrint();
//		 PatternPrint1.pyramid();
//		PatternPrint1.reversePyramid();
		 PatternPrint1.diamond();
	}
}
