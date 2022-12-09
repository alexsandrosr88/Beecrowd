package exercicios;

import java.util.Scanner;

public class Bee1132 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		int min, max, soma = 0;
		
		if(x<y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		for(int i=min; i<=max; i++) {
			if(i % 13 != 0) {
				soma +=i;
			}
		}
		System.out.println(soma);
	}
}
