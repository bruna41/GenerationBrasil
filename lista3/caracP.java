package lista3;

import java.util.Scanner;

public class caracP {

	public static void main(String[] args) {
		int idade, pop = 0, somaPC = 0;
		String f, m, o, pC, pN, pA;
		Scanner c = new Scanner (System.in);
		while (pop <= 2) {
			System.out.println("Sua idade: ");
			idade = c.nextInt();
			System.out.println("Seu sexo: ");
			f = c.nextLine();
			m = c.nextLine();
			o = c.nextLine();
			System.out.println("Vc é uma pessoa calma? (s/n): ");
			pC = c.nextLine();
			System.out.println("Vc é uma pessoa nervosa? (s/n): ");
			pN = c.nextLine();
			System.out.println("Vc é uma pessoa agressiva? (s/n): ");
			pA = c.nextLine();
			if (pC == "s") {
				somaPC ++;
			}
		}
		System.out.println(somaPC);
	}

}
