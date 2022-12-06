package Exercicios;

import java.util.Scanner;

public class Bee1067 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		int i = 0;
		
		while(i<=x) {
			
			if(i % 2 != 0)
				System.out.println(i);
			i++;
		}
	}
}
