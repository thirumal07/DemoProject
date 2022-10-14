import java.util.Scanner;

public class ForLoop1 {

	public static void oddNumber() {
		// odd number between the given input
		System.out.println("Enter any 2 Numbers... ");
		Scanner ob1 = new Scanner(System.in);
		int a = ob1.nextInt();
		int b = ob1.nextInt();
		System.out.println("Odd Numbers..");
		for (int i = a; i <= b; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
		}
		ob1.close();
	}

	public static void evenNumber() {
		// Even number between the given input

		System.out.println("Enter any 2 Numbers... ");
		Scanner ob2 = new Scanner(System.in);
		int a = ob2.nextInt();
		int b = ob2.nextInt();
		System.out.println("Even Numbers..");
		for (int i = a; i <= b; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
		}
		ob2.close();
	}

	public static void tablesMultiply() {
		// Tables

		System.out.println("Eneter the Number table you want ... ");
		Scanner ob3 = new Scanner(System.in);
		int a = ob3.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " x " + a + " = " + (i * a));
		}
		ob3.close();
	}

	public static void main(String[] args) {
		ForLoop1.oddNumber();
		ForLoop1.evenNumber();
		ForLoop1.tablesMultiply();
	}

}
