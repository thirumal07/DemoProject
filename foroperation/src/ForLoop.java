
public class ForLoop {

	public static void loopNumbers() {
		// print the number from 1-100

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
		}
	}

	public static void loopReverse() {
		// 1-100 in reverse order

		for (int i = 100; i >= 1; i--) {
			System.out.print(i + " ");
		}
	}

	public static void oddNumbers() {
		// odd number from 1-100

		System.out.println("Odd Numbers..");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
	}

	public static void evenNumbers() {
		// 1 to 100 Even Numbers

		System.out.println("Even Numbers..");
		for (int i = 0; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
//		ForLoop.loopNumbers();
//		ForLoop.loopReverse();
//		ForLoop.oddNumbers();
//		ForLoop.evenNumbers();
	}

}
