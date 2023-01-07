package curso_algoritmo.beecrowd;

import java.util.Scanner;

public class Bee1019 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
	    int horas, minutos,segundos;
	    int entrada = sc.nextInt();
	    
	    sc.close();

	    if(entrada >= 3600){
	      horas = entrada / 3600;
	      minutos = (entrada - horas * 3600)/60;
	      segundos = entrada - (horas * 3600 + minutos * 60);
	      System.out.println(horas+":"+minutos+":"+segundos);
	    }
	    else if(entrada >= 60) {
	      horas = 0;
	      minutos = entrada /60;
	      segundos = entrada - minutos * 60;
	      System.out.println(horas+":"+minutos+":"+segundos);
	    }
	    else{
	      horas = 0;
	      minutos = 0;
	      segundos = entrada;
	      System.out.println(horas+":"+minutos+":"+segundos);
	    }
	     
	}
}
