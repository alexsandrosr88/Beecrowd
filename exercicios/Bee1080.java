package exercicios;

import java.util.Scanner;

public class Bee1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int maior = n, posicao = 1;
		
		for(int i = 2; i<=4;i++) {
			n = sc.nextInt();
			
			if(maior< n) {
				maior = n;
				posicao = i;
			}
		}
		sc.close();
		
		System.out.println(maior);
		System.out.println(posicao);	
	}
}
