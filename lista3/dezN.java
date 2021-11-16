package lista3;

import java.util.Scanner;

public class dezN {

	public static void main(String[] args) {
		int x, par = 0, impar = 0, numero = 0;
		Scanner rec = new Scanner (System.in);
		for (x=1; x<=10; x++) {
			System.out.print("Número inteiro: ");
			numero = rec.nextInt();
			if (numero%2==0) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}
		}
		System.out.println("Pares: " + par + "\nÍmpares: " + impar);
	}

}