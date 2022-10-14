import java.util.Scanner;

public class MultipleTable {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the  any number to display a table ...");
		int n = ob.nextInt();
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(i * j + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Does not perform 0's and  negative number...");
		}
		ob.close();
	}

}
