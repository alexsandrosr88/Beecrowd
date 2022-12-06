package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bee1064 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double [] v = new double [6];
		
		int n = 0;
		double media = 0.0;
		
		for(int i = 0; i<v.length; i++) {
			v[i]= sc.nextDouble();
			
			if(v[i]>0) {
				n++;
				media+=v[i];
			}
		}
		sc.close();
		
		media=media/n;
		
		System.out.println( n+" valores positivos");
		System.out.printf("%.1f%n",media);
	}
}
