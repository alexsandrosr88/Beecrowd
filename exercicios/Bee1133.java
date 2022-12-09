package exercicios;

import java.util.Scanner;

public class Bee1133 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		sc.close();
		
		int min, max;
		
		if(x<y) {
			min = x;
			max = y;
		}
		else {
			min = y;
			max = x;
		}
		
		for(int i=min+1; i<max; i++) {
			if(i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
	}
}
