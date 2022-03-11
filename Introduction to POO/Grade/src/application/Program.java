package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Grade;

public class Program {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Grade grade = new Grade();
		
		System.out.print("Enter the student name: ");
		grade.name = sc.nextLine();
		
		System.out.print("\nEnter the first test: ");
		grade.p1 = sc.nextDouble();
		
		System.out.print("\nEnter the second test: ");
		grade.p2 = sc.nextDouble();
		
		System.out.print("\nEnter the third test: ");
		grade.p3 = sc.nextDouble();
		
		System.out.println();
		System.out.print("FINAL GRADE = " + grade);
		
		sc.close();
		
	}
	
}
