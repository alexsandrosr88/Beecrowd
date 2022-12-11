package exercicios;

import java.util.Scanner;

public class Bee1146 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = -1;
		
		while(x !=0) {
			x = sc.nextInt();
			for(int i=1; i<=x; i++) {
				if(x==1) {
					System.out.println(i);
				}
				else if(i == x)
					System.out.println(i);
				else
				System.out.print(i+" ");		
			}
		}
		sc.close();
	}
}
