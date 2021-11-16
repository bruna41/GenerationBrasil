package lista4;

import java.util.Scanner;

public class funçãoR {

	public static void main(String[] args) {
		Scanner rec = new Scanner (System.in);
		int quantD, pessoasD = 0;
		System.out.println("Pessoas em uma danceteria: ");
		quantD = rec.nextInt();
		System.out.println("Pessoas dançando: ");
		pessoasD = rec.nextInt();
		System.out.println("Há " + calc(quantD, pessoasD) + " pessoas dançando em média.");
		
		System.out.println("-------------------------------------");
		int lojasShop, vendeS;
		System.out.println("Lojas no shopping: ");
		lojasShop = rec.nextInt();
		System.out.println("Vendem sapatos: ");
		vendeS = rec.nextInt();
		System.out.println("Há " + calc(lojasShop, vendeS) + " lojas que vedem sapato em média.");
		
	}
	public static int calc (int total, int quant) {
		return total / quant;
	}
}
	