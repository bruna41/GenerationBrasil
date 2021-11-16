package lista1;

import java.util.Scanner;

public class potencia {

	public static void main(String[] args) {
		double a, b, c, r, s, d;
		System.out.println("Escreva três números inteiros positivos: ");
		Scanner pot = new Scanner (System.in);
		a = pot.nextInt();
		b = pot.nextInt();
		c = pot.nextInt();
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		d = (r + s) / 2;
		System.out.println(d);
	}

}