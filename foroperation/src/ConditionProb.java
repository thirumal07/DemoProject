import java.util.Scanner;

public class ConditionProb {

	public static void main(String[] args) {
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the age of the Person ...");
		int age = ob.nextInt();
		if (age >= 0 && age < 5) {
			System.out.println("They are a kids ...");
		} else if (age >= 5 && age < 18) {
			System.out.println("They are a School students ...");
		} else if (age >= 18 && age < 23) {
			System.out.println("They are a College Students ...");
		} else if (age >= 23 && age <= 40) {
			System.out.println("They are a Earner ...");
		} else if (age >= 41 && age < 60) {
			System.out.println("They are a Elder ...");
		} else if (age >= 61 && age < 80) {
			System.out.println(" They are a Senior Citien");
		} else if (age >= 80) {
			System.out.println("Theu are a Very Older");
		} else {
			System.out.println("Invalid one try to change youtr input.. ");
		}
		ob.close();
	}

}
