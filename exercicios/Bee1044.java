package exercicios;

import java.util.Scanner;

public class Bee1044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = 0;
		
		sc.close();
		
		if(a < b) {
			for(int i =1; x != b; i++) {
				x = a *i;
				if(x > b) {
					System.out.println("Nao sao Multiplos");
				break;
				}
			}
			if(x == b)
				System.out.println("Sao Multiplos");	
		}
		else {
			for(int i =1; x != a; i++) {
				x = b *i;
				if(x > a) {
					System.out.println("Nao sao Multiplos");
				break;
				}
			}
			if(x == a)
				System.out.println("Sao Multiplos");
		}
	}
}
