package exercicios;

import java.util.Scanner;

public class Bee1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int cobaiaC = 0, cobaiaR = 0, cobaiaS = 0, total=0;
				
		for(int i = 0; i<n; i++) {
			int qtd = sc.nextInt();
			char tipo = sc.next().charAt(0);
			
			if(tipo == 'C')
				cobaiaC+=qtd;
			else if(tipo == 'R')
				cobaiaR+=qtd;
			else
				cobaiaS+=qtd;
		}
		sc.close();
		
		total = cobaiaC+cobaiaR+cobaiaS;
		
		System.out.println("Total: "+total+" cobaias");
		System.out.println("Total de coelhos: "+cobaiaC);
		System.out.println("Total de ratos: "+cobaiaR);
		System.out.println("Total de sapos: "+cobaiaS);

		double totalC = ((cobaiaC*100.0)/total);
		double totalR = ((cobaiaR*100.0)/total);
		double totalS = ((cobaiaS*100.0)/total);
		
		System.out.printf("Percentual de coelhos: %.2f %%%n",totalC);
		System.out.printf("Percentual de ratos: %.2f %%%n",totalR);
		System.out.printf("Percentual de sapos: %.2f %%%n",totalS);
	}
}
