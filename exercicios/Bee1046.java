package exercicios;

import java.util.Scanner;

public class Bee1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hI = sc.nextInt();
		int hF = sc.nextInt();
		
		sc.close();
		
		int resul;
		
		if(hI == 0 && hF == 0)
			System.out.println("O JOGO DUROU 24 HORA(S)");
		else if(hI < 12) {
			resul = 12-hI + (hF - 12);
			System.out.println("O JOGO DUROU "+resul+" HORA(S)");
		}
		else {
			resul = 24-hI + hF;
			System.out.println("O JOGO DUROU "+resul+" HORA(S)");
		}			
	}
}
