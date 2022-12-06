package Exercicios;

import java.util.Scanner;

public class Bee1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] v = new int [5];
		int pares = 0;
		
		for(int i = 0; i<v.length; i++) {
			v[i] = sc.nextInt();
			
			if(v[i] % 2 == 0)
				pares++;
		}
		sc.close();
		
		System.out.println(pares+" valores pares");
	}
}
