package exercicios;

import java.util.Scanner;

public class Bee1101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int min, max, soma = 0;
		
		while(m>0 && n!=0 && n>0 && m!=0) {
			
			if(m<n ) {
				min = m;
				max = n;
			}
			else {
				min = n;
				max = m;
			}
			for (int i = min; i <=max; i++) {
				System.out.print(i+ " ");
				soma+=i;
			}
			System.out.println("Sum="+soma);
			soma = 0;
			
			m = sc.nextInt();
			n = sc.nextInt();
		}
		sc.close();
	}
}
