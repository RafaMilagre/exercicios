package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex5 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter emploee salary: ");
		double salary = sc.nextDouble();
		double increase = 0.15 * salary;
		
		System.out.println("\nSalary increase of = " + increase);
		System.out.println("Adjusted salary = " + (salary + increase));
		
		sc.close();

	}

}
