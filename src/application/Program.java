package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char option;
		
		do {
			System.out.println("Please, enter the temperatures in Fahrenheit:");
		double fahrenheit=sc.nextDouble();
		
		double celsius = (fahrenheit - 32)*5/9;
		
		System.out.printf("The converted temperatures from Fahrenheit to Celsius are: %.2f%n", celsius);
		
		System.out.println("Would you like to do it again? Type 'Y' for Yes and 'N' for No.");
		 option = sc.next().toUpperCase().charAt(0);
		}while(option == 'Y');
		
		
		sc.close();

	}

}
