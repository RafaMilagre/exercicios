package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		double x = Math.sqrt(number);
		
		System.out.println();
		System.out.println("Double: " + number * 2);
		System.out.println("Triple: " + number * 3);
		System.out.println("Square root: " + x);

		sc.close();

	}

}
