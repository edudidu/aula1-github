package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Retangle retangle = new Retangle();
		
		System.out.println("Enter widht :");	
		retangle.width = sc.nextDouble();
		
		System.out.println("Enter eight :");	
		retangle.height = sc.nextDouble();

	
		
		System.out.println();
		System.out.println("AREA: " + retangle.area());
		System.out.println("PERIMETER: " + retangle.perimeter());
		System.out.println("DIAGONAL: " + retangle.diagonal());
		
		
		
		sc.close();

	}

}
