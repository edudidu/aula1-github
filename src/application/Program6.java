package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.println("Name :");
		student.name = sc.nextLine();

		System.out.println("Nota 01 :");
		student.nota1 = sc.nextDouble();

		System.out.println("Nota 02 :");
		student.nota2 = sc.nextDouble();

		System.out.println("Nota 03 :");
		student.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
		if (student.finalGrade() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
