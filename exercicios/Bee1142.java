package exercicios;

import java.util.Scanner;

public class Bee1142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sc.close();

		int cont = 0;

		for (int i = 1; i <= 3 * n + (n - 1); i++) {
			System.out.print(i + " ");
			cont++;
			if (cont == 3) {
				System.out.println("PUM");
				cont = 0;
				i++;
			}
		}
	}
}
