package curso_algoritmo.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoPeca1 = sc.nextInt();
		int numPecas1 = sc.nextInt();
		double valorItem1 = sc.nextDouble();
		
		int codigoPeca2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double valorItem2 = sc.nextDouble();
		
		sc.close();
		
		double total = numPecas1 * valorItem1 + numPecas2 * valorItem2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	}
}
