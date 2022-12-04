package exercicios;

import java.util.Scanner;

public class Bee1047A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int hI = sc.nextInt();
//		int mI = sc.nextInt();
//		int hF = sc.nextInt();
//		int mF = sc.nextInt();
		
		sc.close();
		
		int hI = 8;
		int mI = 43;
		int hF = 21;
		int mF = 43;
		
		
		int calcHoras, minTotal, horaFim, minFim;	
				
		if(hI == hF && mI == mF)
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else {
			int difResul = Math.abs((hI * 60 + mI) - (hF * 60 + mF));
			
			horaFim = difResul / 60;
			
			minFim = difResul % 60;
			
			System.out.println("O JOGO DUROU "+ horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
	}
}
