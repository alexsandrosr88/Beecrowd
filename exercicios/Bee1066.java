package Exercicios;

import java.util.Scanner;

public class Bee1066 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] v = new int [5];
		int pares = 0, impar = 0, positivo = 0, negativo = 0;
		
		for(int i = 0; i<v.length; i++) {
			v[i] = sc.nextInt();
			
			if(v[i] % 2 == 0)
				pares++;
			if(v[i] % 2 != 0)
				impar++;
			if(v[i] > 0)
				positivo++;
			if(v[i]<0)
				negativo++;
		}
		sc.close();
		
		System.out.println(pares+" valor(es) par(es)");
		System.out.println(impar+" valor(es) impar(es)");
		System.out.println(positivo+" valor(es) positivo(s)");
		System.out.println(negativo+" valor(es) negativo(s)");
		
	}
}
