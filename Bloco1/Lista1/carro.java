package lista1;

import java.util.Scanner;

public class carro {

	public static void main(String[] args) {
		double cuscon, cusF, porcent, imp;
		System.out.println("Custo de f�brica: ");
		
		Scanner leia = new Scanner (System.in);
		cusF = leia.nextDouble();
		porcent = (cusF*28) / 100;
		imp = (cusF*45) / 100;
		cuscon = porcent + imp + cusF;
		System.out.println("Custo ao consumidor: " + cuscon);
	}

}
