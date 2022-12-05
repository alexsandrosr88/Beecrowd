package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bee1043 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		sc.close();
		
		if(a+b > c && b+c > a && a+c >b) {
			double p = a+b+c;
			System.out.printf("Perimetro = %.1f%n",p);
		}
		else {
			double area = ((a+b)*c)/2;
			System.out.printf("Area = %.1f%n",area);
		}
	}
}
