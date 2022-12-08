package exercicios;

import java.util.Scanner;

public class Bee1154 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int idade = sc.nextInt();
		int cont = 0;
		double soma = 0.0;
		
		while(idade > 0) {
			cont++;
			soma+=idade;
			idade = sc.nextInt();
		}
		sc.close();
		
		System.out.println(String.format("%.2f", soma/cont));
	}
}
