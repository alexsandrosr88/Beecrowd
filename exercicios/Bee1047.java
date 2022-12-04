package exercicios;

import java.util.Scanner;

public class Bee1047 {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int hI = sc.nextInt();
		int mI = sc.nextInt();
		int hF = sc.nextInt();
		int mF = sc.nextInt();
		
		sc.close();
		
		if(hI == hF && mI == mF)
			System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");		
		else if(hI > hF && mI<=mF) {
			int calHoras = (Math.abs((24-hI) + hF))*60;
			int calMin = Math.abs(mI - mF);
			int minTotal = Math.abs(calHoras + calMin);
			
			int horaFim = minTotal / 60;
			int minFim = minTotal % 60;
			System.out.println("O JOGO DUROU "+horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
		else if(hI >= hF && mI>=mF) {
			int calHoras = (Math.abs((24-hI) + hF))*60;
			int calMin = Math.abs(mI - mF);
			int minTotal = Math.abs(calHoras - calMin);
			
			int horaFim = minTotal / 60;
			int minFim = minTotal % 60;
			System.out.println("O JOGO DUROU "+horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
		else if(hI <=12 && hF <=12 && mI<mF) {
			int calHoras = (Math.abs((12-hI) - (12-hF)))*60;
			int calMin = Math.abs(mI - mF);
			int minTotal = Math.abs(calHoras + calMin);
			
			int horaFim = minTotal / 60;
			int minFim = minTotal % 60;
			
			System.out.println("O JOGO DUROU "+horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
		else if(hI <=12 && hF <=12 && mI>mF) {
			int calHoras = (Math.abs((12-hI) - (12-hF)))*60;
			int calMin = Math.abs(mI - mF);
			int minTotal = Math.abs(calHoras - calMin);
			
			int horaFim = minTotal / 60;
			int minFim = minTotal % 60;
			
			System.out.println("O JOGO DUROU "+horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
		else if(hI > 12 && mI<=mF) {
			int calHoras = (Math.abs(hI - hF))*60;
			int calMin = Math.abs(mI - mF);
			int minTotal = Math.abs(calHoras + calMin);
			
			int horaFim = minTotal / 60;
			int minFim = minTotal % 60;
			
			System.out.println("O JOGO DUROU "+horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
		else {
			int calHoras = (Math.abs(hI - hF))*60;
			int calMin = Math.abs(mI - mF);
			int minTotal = Math.abs(calHoras - calMin);
			
			int horaFim = minTotal / 60;
			int minFim = minTotal % 60;
			
			System.out.println("O JOGO DUROU "+horaFim+" HORA(S) E "+minFim+" MINUTO(S)");
		}
	}
}