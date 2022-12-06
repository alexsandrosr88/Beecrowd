package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bee1060 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double [] v = new double [6];
		
		int n = 0;
		
		for(int i = 0; i<v.length; i++) {
			v[i]= sc.nextDouble();
			
			if(v[i]>0) {
				n++;
			}
		}
		sc.close();
		
		System.out.println( n+" valores positivos");
	}
}
