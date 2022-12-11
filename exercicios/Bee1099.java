package exercicios;

import java.util.Scanner;

public class Bee1099 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int min, max, soma = 0;

		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			if (x < y) {
				min = x;
				max = y;
			} else {
				max = x;
				min = y;
			}
			
			for (int j = min+1; j < max; j++) {
				if (j % 2 != 0) {
					soma += j;
				}
			}
			System.out.println(soma);
			soma =0;
		}
		sc.close();
	}
}
