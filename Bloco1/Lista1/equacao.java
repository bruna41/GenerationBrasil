package lista1;

import java.util.Scanner;

public class equacao {
	
	public static void main(String[] args) {
		int a, b, c, d, e, f, x, y;
		System.out.println("Escreva os valores: ");
		
		Scanner v = new Scanner (System.in);
		a = v.nextInt();
		b = v.nextInt();
		c = v.nextInt();
		d = v.nextInt();
		e = v.nextInt();
		f = v.nextInt();
		x = (c*e) - (b*f) / (a*e) - (b*d);
		y = (a*f) - (c*d) / (a*e) - (b*d);
	}

}
