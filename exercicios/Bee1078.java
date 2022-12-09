package exercicios;

import java.util.Scanner;

public class Bee1078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int resul;
		
		for(int i = 1; i<=10; i++) {
			resul = i * n;
			System.out.println(i+" x "+n+" = "+resul);
		}
		sc.close();
	}
}
