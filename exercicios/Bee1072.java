package Exercicios;

import java.util.Scanner;

public class Bee1072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] x = new int [n];
		
		int in = 0;
		int out = 0;
				
		
		for(int i =0; i<x.length;i++) {
			x[i] = sc.nextInt();
			
			if(x[i]>=10 && x[i]<=20) 
				in++;
			else
				out++;
		}
		sc.close();
		
		System.out.println(in+" in");
		System.out.println(out+" out");
	}
	
}
