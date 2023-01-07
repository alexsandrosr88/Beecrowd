package curso_algoritmo.beecrowd;

import java.util.Locale;
import java.util.Scanner;

public class Bee1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int hora = sc.nextInt();
		double salarioHora = sc.nextDouble();
		
		sc.close();
		
		double salario = hora * salarioHora;
		
		System.out.println("NUMBER = "+number);
		System.out.printf("SALARY = U$ %.2f%n", salario);
	}

}
