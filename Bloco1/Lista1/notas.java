package lista1;

import java.util.Scanner;

public class notas {
	
	public static void main(String[] args) {
		double nota1, nota2, nota3, mediaF;
		System.out.print("Escrevas as notas: ");
		Scanner calc = new Scanner (System.in);
		nota1 = calc.nextDouble();
		nota2 = calc.nextDouble();
		nota3 = calc.nextDouble();
		nota1 *= 2;
		nota2 *= 3;
		nota3 *= 5;
		mediaF = (nota1 + nota2 + nota3) / 3;
		System.out.println(mediaF);
	}
}
