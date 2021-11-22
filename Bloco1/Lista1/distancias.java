package lista1;

import java.util.Scanner;

public class distancias {

	public static void main(String[] args) {
		double quad1, quad2, somaQ, x1, x2, y1, y2, dist;
		Scanner d = new Scanner (System.in);
		System.out.println("Escreva as diatancias x1, x2, y1, y2, respectivamente: ");
		x1 = d.nextDouble();
		x2 = d.nextDouble();
		y1 = d.nextDouble();
		y2 = d.nextDouble();
		quad1 = Math.pow((x2-x1), 2);
		quad2 = Math.pow((y2-y1), 2);
		somaQ = quad1 + quad2;
		dist = Math.sqrt(somaQ);
		System.out.println(dist);
	}

}
