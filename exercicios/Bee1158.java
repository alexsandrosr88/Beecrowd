package exercicios;

import java.util.Scanner;

public class Bee1158 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int soma = 0;

		for (int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			for (int j=x; j<x+y+y; j++) {
				if (j % 2 != 0)
					soma += j;
			}
			System.out.println(soma);
			soma = 0;
		}
		sc.close();
	}
}
