import java.util.Scanner;

public class Fizzbuzz {
	public static void main(String[] args) {
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		int BOUND = input.nextInt();
		fizzBuzz(BOUND);
		input.close();
	}

	public static void fizzBuzz(int bound) {
		for (int i = 1; i <= bound; i++) {
			boolean fizzOrBuzz = false;
			if (i % 3 == 0) {
				System.out.print("Fizz");
				fizzOrBuzz = true;
			}
			if (i % 5 == 0) {
				System.out.print("Buzz");
				fizzOrBuzz = true;
			}

			if (fizzOrBuzz) {
				System.out.println();
			} else {
				System.out.println(String.valueOf(i));
			}
		}
	}
}