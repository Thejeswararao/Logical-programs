package bridgelabz.com;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {

		int remainder, reverse = 0;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		while (num != 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
		}
		System.out.println(reverse);

	}
}
