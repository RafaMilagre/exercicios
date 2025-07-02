package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex3 {
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter note 1: ");
		double note1 = sc.nextInt();
		System.out.print("Enter note 2: ");
		double note2 = sc.nextInt();
		double average = (note1 + note2) / 2;
		
		System.out.println("Average = " + String.format("%.2f", average));
		
		sc.close();
		

	}

}
