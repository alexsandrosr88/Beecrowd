package exercicios;

import java.util.Scanner;

public class Bee1073 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		int resul;
		
		for(int i = 1; i<=n; i++) {
			if(i % 2 == 0) {
				resul = i * i;
				System.out.println(i+"^2 = "+resul);
			}
		}	
	}
}
