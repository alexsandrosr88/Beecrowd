package Exercicios;

import java.util.Scanner;

public class Bee1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		sc.close();
		
		int count = 6;
		
		while(count>0) {
			
			if(x % 2 != 0) {
				System.out.println(x);
			x++;
			count--;
			}
			else
				x++;
		}
	}
}
