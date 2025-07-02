package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		
		System.out.println("Multiplication Table");
		for(int i = 1; i <= 10; i++) {
			System.out.println(number + " * " +  i + " = " + number * i);
		}
		
		sc.close();
		

	}

}
