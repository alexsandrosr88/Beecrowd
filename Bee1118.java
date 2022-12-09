package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bee1118 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double media;
		int op = 0;

		boolean calc = false;
		
		while(op != 2) {
			while(n1 < 0 || n1 > 10) {
				System.out.println("nota invalida");
				n1 = sc.nextDouble();
			}
			while(n2 < 0 || n2 > 10) {
				System.out.println("nota invalida");
				n2 = sc.nextDouble();
			}
			if(n1 > 0 && n1 <= 10 && n2 > 0 && n2 <= 10 && calc == false ) {
				media = (n1+n2)/2;
				System.out.printf("media = %.2f%n",media);
				calc = true;
			}
			System.out.println("novo calculo (1-sim 2-nao)");
			op = sc.nextInt();

			if (op == 1) {
				n1 = sc.nextDouble();
				n2 = sc.nextDouble();
				calc = false;
			}			
		}
		sc.close();
	}
}
