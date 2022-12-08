package exercicios;

import java.util.Scanner;

public class Bee1116 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double a, b;
		double resul;
			
		for(int i =0; i<n; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			
			if(b == 0)
				System.out.println("divisao impossivel");
		
			else {
				resul = a/b;
				System.out.println(String.format("%.1f", resul));
			}
		}
		sc.close();
	}
}
