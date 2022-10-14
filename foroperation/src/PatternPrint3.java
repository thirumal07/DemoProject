import java.util.Scanner;

public class PatternPrint3 {
	
	public static void main(String[] args) {
		Scanner  ob = new Scanner(System.in);
		System.out.println("Enter a  number to print the Star ... ");
		int n =ob.nextInt();
		int i, j, k;
		for (i = 0; i <=n; i++) {
			for (j = n - i; j > 1; j--) {
				System.out.print("*");
			}
			for (k = 0; k <= i; k++) {
				System.out.print("  ");
			}
			for (j = n- i; j > 1; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			for (k = 0; k < n - 1 - i; k++) {
				System.out.print("  ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
