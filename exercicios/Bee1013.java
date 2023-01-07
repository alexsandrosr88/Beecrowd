package curso_algoritmo.beecrowd;

import java.util.Scanner;

public class Bee1013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		sc.close();
		
		int maiorAb = (a + b + Math.abs(a - b)) /2;
		if ( maiorAb > c)
			
			System.out.println(maiorAb+" eh o maior");
		else 
			System.out.println(c+" eh o maior");
	}
}
