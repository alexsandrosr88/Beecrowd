package exercicios;

import java.util.Scanner;

public class Bee1144 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+" ");
			System.out.print(i*i+" ");
			System.out.println(i*i*i);
			System.out.print(i+" ");
			System.out.print(i*i+1+" ");
			System.out.println(i*i*i+1);
		}
	}
}
