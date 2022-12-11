package exercicios;

import java.util.Scanner;

public class Bee1145 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 3;
		
		int y = 99;
		
		sc.close();
		
		int cont = 0;
		
		for(int i=1; i<=y; i++) {
			System.out.print(i+" ");
			cont++;
			if(cont>x-2) {
				i++;
				System.out.println(i);
				cont = 0;
			}
		}
	}
}
