package curso_algoritmo.beecrowd;

import java.util.Scanner;

public class Bee1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		sc.close();
		
		int diferenca = a * b - c * d;
		
		System.out.printf("DIFERENCA = %d%n", diferenca);

	}

}
