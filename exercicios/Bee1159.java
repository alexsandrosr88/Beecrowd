package exercicios;

import java.util.Scanner;

public class Bee1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		int cont = 0;
		
		while (x != 0) {
			while(cont <5) {
				if(x % 2 == 0) {
					soma+=x;
					x++;
					cont++;
				}
				else
					x++;
			}
			System.out.println(soma);
			soma = 0;
			cont = 0;
			x = sc.nextInt();
		}
		sc.close();
	}
}
