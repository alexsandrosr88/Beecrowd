package curso_algoritmo.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		
		double b = sc.nextDouble();
		
		sc.close();

		double media = (a*3.5 + b*7.5) / (3.5+7.5);
		
		System.out.printf("MEDIA = %.5f%n", media);
	}
}
