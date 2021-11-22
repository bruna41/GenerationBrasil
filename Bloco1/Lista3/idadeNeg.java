package lista3;

import java.util.Scanner;

public class idadeNeg {

	public static void main(String[] args) {
		int menos21 = 0, mais50 = 0, idade = 0;
		Scanner rec = new Scanner (System.in);
		while (idade != -99) {
			System.out.println("Idade: ");
			idade = rec.nextInt();
			if (idade < 21) {
				menos21++;
			}else if (idade > 50) {
				mais50++;
			}
		}
		System.out.println(menos21 + "/" + mais50);

	}

}
