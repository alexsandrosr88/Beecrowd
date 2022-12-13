package exercicios;

import java.util.Locale;

public class Bee1098 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		for (int i = 0; i < 3; i++) {
			double i2 = i;
			int cont = 12;

			int j2 = (int) i + 1;

			for (int j = 1; j <= 3; j++) {

				if (i == 0) {
					System.out.print("I=" + i + " ");
					System.out.println("J=" + j);
				} else {
					System.out.print("I=" + i + " ");
					System.out.println("J=" + j2);
					j2++;
				}

			}
			while (cont > 0 && i < 2) {
				i2 += 0.2;
				double j3 = 1.0 + i2;

				for (int k = 0; k < 3; k++) {
					System.out.printf("I=%.1f ", i2);
					System.out.println("J=" + String.format("%.1f", j3));
					j3 += 1.0;
					cont--;
				}
			}
		}
	}
}
