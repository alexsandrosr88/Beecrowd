package exercicios;

import java.util.Scanner;

public class Bee1114 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		int n = sc.nextInt();

		while(n != 2002) {
			System.out.println("Senha Invalida");
			n = sc.nextInt();
		}	
		sc.close();
		
		if(n == 2002)
			System.out.println("Acesso Permitido");
	}
}
