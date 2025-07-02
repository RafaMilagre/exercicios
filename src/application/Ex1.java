package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		System.out.println();
		System.out.println("Successor: " + (number + 1));
		System.out.println("Predecessor: " + (number - 1));
		
		sc.close();	

	}

}
