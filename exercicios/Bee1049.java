package Exercicios;

import java.util.Scanner;

public class Bee1049 {
  Scanner sc = new Scanner(System.in);
		
		String palavra1 = sc.nextLine();
		
		String palavra2 = sc.nextLine();

		String palavra3 = sc.nextLine();
		
		sc.close();
		
		switch (palavra1) {
		case "vertebrado":
			switch (palavra2) {
			case "ave":
				switch (palavra3) {
				case "carnivoro":
					System.out.println("aguia");
					break;
				case "onivoro":
					System.out.println("pomba");
					break;
				default:
					break;
				}	
				break;
			case "mamifero":
				switch (palavra3) {
				case "onivoro":
					System.out.println("homem");
					break;
				case "herbivoro":
					System.out.println("vaca");
				default:
					break;
				}
			default:
				break;
			}
			break;
		case "invertebrado":
			switch (palavra2) {
			case "inseto":
				switch (palavra3) {
				case "hematofago":
					System.out.println("pulga");
					break;
				case "herbivoro":
					System.out.println("lagarta");
					break;
				default:
					break;
				}
				break;
			case "anelideo":
				switch (palavra3) {
				case "hematofago":
					System.out.println("sanguessuga");
					break;
				case "onivoro":
					System.out.println("minhoca");
					break;
				default:
					break;
				}
			default:
				break;
			}
		default:
			break;
		}		
	}
}
