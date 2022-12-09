package exercicios;

import java.util.Scanner;

public class Bee1153 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int resul = n;
		
		for(int i=1; i<n; i++) {
			resul = resul * (n-i);	
		}
		System.out.println(resul);
	}
}
