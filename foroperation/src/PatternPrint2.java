import java.util.Scanner;

public class PatternPrint2 {

	public static void sandGlass() {

		Scanner ob = new Scanner(System.in);
		System.out.println("Enter a  number to print the Star ... ");
		int n = ob.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
		ob.close();
	}

	public static void main(String[] args) {
		PatternPrint2.sandGlass();
	}

}
