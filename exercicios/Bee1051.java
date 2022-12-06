package Exercicios;

import java.util.Scanner;

public class Bee1051 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		
		sc.close();
		
		double imposto8, imposto18, imposto28, descontoTotal;
		
		if(salario > 0.0 && salario <= 2000.00) {
			System.out.println("Isento");
		}
		else if(salario >= 2000.01 && salario <= 3000.00) {
			imposto8 = ((salario - 2000.00) * 8)/100;
			
			System.out.println("R$ "+String.format("%.2f", imposto8));
		}
		else if(salario >= 3000.01 && salario <= 4500.00) {
			imposto18 = salario - 3000.00;
			imposto8 = salario - (2000 + imposto18);
			descontoTotal = ((imposto8*8)/100) + ((imposto18*18)/100);
			System.out.println("R$ "+String.format("%.2f",descontoTotal));
		}
		else {
			imposto28 = salario - 4500;
			imposto18 = salario - (3000 + imposto28);
			imposto8 = salario - (imposto18 + imposto28+ 2000);
			
			descontoTotal = (((imposto28)*28)/100)+(((imposto18*18))/100)+((imposto8*8)/100);
			
			System.out.println("R$ "+String.format("%.2f", descontoTotal));
		}
		
	}
}
