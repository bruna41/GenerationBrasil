package lista2;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		double num, raiz, quad;
		Scanner n = new Scanner (System.in);
		System.out.print("Número inteiro: ");
		num = n.nextInt();
		if (num % 2 == 0) {
			raiz = Math.sqrt(num);
			System.out.print("Raiz de " + num + " é: " + raiz);
		}else {
			quad = Math.pow(num, 2.0);
			System.out.print("O quadrado de " + num + " é: " + quad);
		}
	}

}
