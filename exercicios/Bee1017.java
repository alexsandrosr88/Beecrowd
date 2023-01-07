package curso_algoritmo.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora = sc.nextInt();
		int veloci = sc.nextInt();
		
		sc.close();
		
		double litros = (veloci*hora) / 12.0;
		
		System.out.printf("%.3f\n",litros);
		
		sc.close();
	}

}
