package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Bee1040 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		n1 = sc.nextFloat();
		n2 = sc.nextFloat();
		n3 = sc.nextFloat();
		n4 = sc.nextFloat();
		
		media = (n1*2+n2*3+n3*4+n4*1)/10;
		
		if(media>= 7.0) {
			System.out.println("Media: "+String.format("%.1f",media));
			System.out.println("Aluno aprovado.");
		}
		else if(media <5.0) {
			System.out.println("Media: "+String.format("%.1f",media));
			System.out.println("Aluno reprovado.");
		}
		else if(media >=5.0 && media <=6.9) {
			double exame = sc.nextDouble();
			System.out.println("Media: "+String.format("%.1f",media));
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: "+String.format("%.1f", exame));
			media = (float)(media + exame)/2;
			if(media > 5.0) { 
				System.out.println("Aluno aprovado.");
				
			}
			else
				System.out.println("Aluno reprovado.");
		}
		System.out.println("Media final: "+String.format("%.1f",media));
		
		sc.close();
	}
}
