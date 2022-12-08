package exercicios;

import java.util.Scanner;

public class Bee1131 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inter = sc.nextInt();
		int gremio = sc.nextInt();
		int contInter = 0;
		int contGremio = 0;
		int grenais = 0;
		int empate = 0;
		int op = 0;
		
		while(op != 2) {
			if(inter > gremio) {
				grenais++;
				contInter++;				
			}
			else if(gremio>inter) {
				grenais++;
				contGremio++;
			}
			else {
				grenais++;
				empate++;
			}
			
			System.out.println("Novo grenal (1-sim 2-nao)");
			op = sc.nextInt();
			
			if(op == 1) {
				inter = sc.nextInt();
				gremio = sc.nextInt();
			}
		}
		sc.close();
		
		System.out.println(grenais+" grenais");
		System.out.println("Inter:"+contInter);
		System.out.println("Gremio:"+contGremio);
		System.out.println("Empates:"+empate);
		
		if(contInter>contGremio)
			System.out.println("Inter venceu mais");
		else if(contGremio>contInter)
			System.out.println("Gremio venceu mais");
		else
			System.out.println("Nao houve vencedor");
	}
}
