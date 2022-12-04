package exercicios;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Bee1040 {
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, media;
		
		nota1 = sc.nextFloat();
		nota2 = sc.nextFloat();
		nota3 = sc.nextFloat();
		nota4 = sc.nextFloat();
		
		media = (float) ((nota1*2)+(nota2*3)+(nota3*4)+(nota4*1))/10;
		
		if(media >= 7.0) {
			System.out.println("Media: "+String.format("%.1f",media));
			System.out.println("Aluno aprovado.");
		}
		else if(media <5.0) {
			System.out.println("Media: "+String.format("%.1f",media));
			System.out.println("Aluno reprovado.");
		}
		else if(media >=5.0 && media <=6.9) {
			double exame = sc.nextFloat();
			System.out.println("Media: "+String.format("%.1f",media));
			System.out.println("Aluno em exame.");
			System.out.println("Nota do exame: "+String.format("%.1f", exame));
			media = (float) (media + exame)/2;
			if(media > 5.0) { 
				System.out.println("Aluno aprovado.");			
			}
			else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: "+String.format("%.1f",media));
		}	
		
		sc.close();
	}
}
