package exercicios;

import java.util.Scanner;

public class Bee1044B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 6;
		int b = 25;
		int x, i = 1;
		
		sc.close();
		
		if(a<b) {
			do {
				x = a * i;
				i++;
			}while(x!= b || x < b);
		}
	}
}
