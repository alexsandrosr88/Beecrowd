package exercicios;

import java.util.Scanner;

public class Bee1044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		sc.close();

		if (b > a && b % a == 0)
			System.out.println("Sao Multiplos");
		else if (b > a && b % a != 0)
			System.out.println("Nao sao Multiplos");
		else if (a > b && a % b == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
	}
}
