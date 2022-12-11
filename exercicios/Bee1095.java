package exercicios;

public class Bee1095 {
	public static void main(String[] args) {
		int j = 60;
		
		for(int i=1;i<60; i++) {
			if(i == 1) {
				System.out.print("I="+(i)+" ");
				System.out.println("J="+j);
			}
			else if(j!=0) {
				j-=5;
				System.out.print("I="+(i+=2)+" ");
				System.out.println("J="+j);
			}
			else {
				j=0;
				System.out.print("I="+(i+=2)+" ");
				System.out.println("J="+j);
			}
		}
	}
}
