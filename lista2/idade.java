package lista2;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		int idade;
		Scanner ler = new Scanner (System.in);
		System.out.print("Sua idade: ");
		idade = ler.nextInt();
		if (idade <= 10) {
			System.out.println("Muito Novo");
		}else if (idade <= 14) {
			System.out.println("Infantil");
		}else if (idade <= 17) {
			System.out.println("Juvenil");
		}else if (idade <= 25) {
			System.out.println("Adulto");
		}else {
			System.out.println("Velho Adulto");
		}
	}

}
