package exercicios;

import java.util.Scanner;

public class Bee1143 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 5;
		
		sc.close();
			
		for(int i = 1; i<=n; i++) {
			System.out.print(i+ " ");
			System.out.print(i*i+" ");
			System.out.print(i*i*i);
			System.out.println();
		}
	}
}
