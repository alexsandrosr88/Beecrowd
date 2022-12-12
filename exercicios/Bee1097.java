package Exercicios;

public class Bee1097 {
	public static void main(String[] args) {
		int j = 7;
		for(int i=1; i<=9;i++) {
			int cont = 3;
			while(cont>0) {
				System.out.print("I="+i+" ");
				System.out.println("J="+j);
				j--;
				cont--;
			}
			i+=1;
			j+=5;
		}
	}
}