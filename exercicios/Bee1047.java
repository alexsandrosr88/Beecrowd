package exercicios;

import java.util.Scanner;

public class Bee1047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int hI = sc.nextInt();
//		int mI = sc.nextInt();
//		int hF = sc.nextInt();
//		int mF = sc.nextInt();
		
		sc.close();
		
		int hI = 8;
		int mI = 10;
		int hF = 10;
		int mF = 2;
		
		
		int calcHoras, minTotal, horaFim, minFim;	
		
		if(hI == hF && mI == mF)
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
		else if(hI > 12 && hF < 12) {
			calcHoras = 24 - hI + hF;
			
			minTotal = calcHoras * 60 - (mI + mF);
			
			horaFim = minTotal / 60;
			minFim = minTotal % 60;
			
			System.out.println("O JOGO DUROU "+ horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
		else if(hI < 12 && hF > 12) {
			calcHoras = 12 - hI + hF;
			
			minTotal = calcHoras * 60 - (mI + mF);
			horaFim = minTotal / 60;
			minFim = minTotal % 60;
			
			System.out.println("O JOGO DUROU "+ horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
		else {
			calcHoras = hF - hI;
			
			minTotal = calcHoras * 60 + (mI + mF);
			horaFim = minTotal / 60;
			minFim = minTotal % 60;
			
			System.out.println("O JOGO DUROU "+ horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
	}
}
