package Exercicios;

import java.util.Scanner;

public class Bee1042 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int aux;
		
		int d = a;
		int e = b;
		int f = c;
		
		
		while(a>b || b>c) {
			while(a>b ) {
				aux = a;
				a = b;
				b = aux;
			}
			
			while(b>c ) {
				aux = b;
				b = c;
				c = aux;
			}
		}
		
		sc.close();

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}