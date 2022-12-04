package exercicios;

import java.util.Scanner;

public class Bee1042 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int d = a;
		int e = b;
		int f = c;
		
		sc.close();
		
		int aux = a;
		
		do {
			
			while (a > b) {
				aux = a;
				a = b;
				b = aux;
			
			}
			
			while(b > c) {
				aux = b;
				b = c;
				c = aux;	
			}
		}
		while(a>b || b>c);
			
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
